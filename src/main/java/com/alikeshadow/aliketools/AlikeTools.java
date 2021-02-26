package com.alikeshadow.aliketools;

import com.alikeshadow.aliketools.armour.*;
import com.alikeshadow.aliketools.blocks.*;
import com.alikeshadow.aliketools.blocks.concrete.*;
import com.alikeshadow.aliketools.blocks.doors.Obsidian_Door;
import com.alikeshadow.aliketools.entity.horse.*;
import com.alikeshadow.aliketools.items.*;
import com.alikeshadow.aliketools.items.food.*;
import com.alikeshadow.aliketools.setup.*;
import com.alikeshadow.aliketools.world.*;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("aliketools")
public class AlikeTools {
    private static final Logger LOGGER = LogManager.getLogger();
    private static IProxy proxy = DistExecutor.runForDist(() -> ClientProxy::new, () -> ServerProxy::new);
    public static ModSetup setup = new ModSetup();

    public AlikeTools() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.COMMON_CONFIG);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        Config.loadConfig(Config.COMMON_CONFIG, FMLPaths.CONFIGDIR.get().resolve("aliketools-common.toml"));
    }

    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("Setup for AlikeTools");
        setup.init();
        proxy.init();
        ChangeWorldGen.changeWorldGen();
        MinecraftForge.EVENT_BUS.register(new MobDrops());
        MinecraftForge.EVENT_BUS.register(new ToolTip());

        RenderTypeLookup.setRenderLayer(ModBlocks.GLASSSLAB, RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GLASSSTAIRS, RenderType.getCutoutMipped());
    }

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {

        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
            event.getRegistry().register(new MultiOre());
            event.getRegistry().register(new SmoothStoneStairs());
            event.getRegistry().register(new GlassSlab());
            event.getRegistry().register(new GlassStairs());
            event.getRegistry().register(new RedstoneSlab());
            event.getRegistry().register(new RedstoneStairs());
            event.getRegistry().register(new SlimeSlab());
            event.getRegistry().register(new SlimeStairs());
            event.getRegistry().register(new GlowstoneSlab());
            event.getRegistry().register(new GlowstoneStairs());

            event.getRegistry().register(new WhiteConcreteSlab());
            event.getRegistry().register(new WhiteConcreteStairs());
            event.getRegistry().register(new OrangeConcreteSlab());
            event.getRegistry().register(new OrangeConcreteStairs());
            event.getRegistry().register(new MagentaConcreteSlab());
            event.getRegistry().register(new MagentaConcreteStairs());
            event.getRegistry().register(new LightBlueConcreteSlab());
            event.getRegistry().register(new LightBlueConcreteStairs());
            event.getRegistry().register(new YellowConcreteSlab());
            event.getRegistry().register(new YellowConcreteStairs());
            event.getRegistry().register(new LimeConcreteSlab());
            event.getRegistry().register(new LimeConcreteStairs());
            event.getRegistry().register(new PinkConcreteSlab());
            event.getRegistry().register(new PinkConcreteStairs());
            event.getRegistry().register(new GrayConcreteSlab());
            event.getRegistry().register(new GrayConcreteStairs());
            event.getRegistry().register(new LightGrayConcreteSlab());
            event.getRegistry().register(new LightGrayConcreteStairs());
            event.getRegistry().register(new CyanConcreteSlab());
            event.getRegistry().register(new CyanConcreteStairs());
            event.getRegistry().register(new PurpleConcreteSlab());
            event.getRegistry().register(new PurpleConcreteStairs());
            event.getRegistry().register(new BlueConcreteSlab());
            event.getRegistry().register(new BlueConcreteStairs());
            event.getRegistry().register(new BrownConcreteSlab());
            event.getRegistry().register(new BrownConcreteStairs());
            event.getRegistry().register(new GreenConcreteSlab());
            event.getRegistry().register(new GreenConcreteStairs());
            event.getRegistry().register(new RedConcreteSlab());
            event.getRegistry().register(new RedConcreteStairs());
            event.getRegistry().register(new BlackConcreteSlab());
            event.getRegistry().register(new BlackConcreteStairs());

            event.getRegistry().register(new Stalagmite());
            event.getRegistry().register(new Stalactite());

            event.getRegistry().register(new Obsidian_Door());

        }

        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            Item.Properties properties = new Item.Properties().group(setup.itemGroup);

            event.getRegistry().register(new BlockItem(ModBlocks.MULTIORE, properties).setRegistryName("multiore"));
            event.getRegistry().register(new BlockItem(ModBlocks.SMOOTHSTONESTAIRS, properties).setRegistryName("smoothstonestairs"));
            event.getRegistry().register(new BlockItem(ModBlocks.GLASSSLAB, properties).setRegistryName("glassslab"));
            event.getRegistry().register(new BlockItem(ModBlocks.GLASSSTAIRS, properties).setRegistryName("glassstairs"));
            event.getRegistry().register(new BlockItem(ModBlocks.REDSTONESLAB, properties).setRegistryName("redstoneslab"));
            event.getRegistry().register(new BlockItem(ModBlocks.REDSTONESTAIRS, properties).setRegistryName("redstonestairs"));
            event.getRegistry().register(new BlockItem(ModBlocks.SLIMESLAB, properties).setRegistryName("slimeslab"));
            event.getRegistry().register(new BlockItem(ModBlocks.SLIMESTAIRS, properties).setRegistryName("slimestairs"));
            event.getRegistry().register(new BlockItem(ModBlocks.GLOWSTONESLAB, properties).setRegistryName("glowstoneslab"));
            event.getRegistry().register(new BlockItem(ModBlocks.GLOWSTONESTAIRS, properties).setRegistryName("glowstonestairs"));

            event.getRegistry().register(new BlockItem(ModBlocks.WHITECONCSLAB, properties).setRegistryName("white_concrete_slab"));
            event.getRegistry().register(new BlockItem(ModBlocks.WHITECONCSTAIR, properties).setRegistryName("white_concrete_stairs"));
            event.getRegistry().register(new BlockItem(ModBlocks.ORANGECONCSLAB, properties).setRegistryName("orange_concrete_slab"));
            event.getRegistry().register(new BlockItem(ModBlocks.ORANGECONCSTAIR, properties).setRegistryName("orange_concrete_stairs"));
            event.getRegistry().register(new BlockItem(ModBlocks.MAGENTACONCSLAB, properties).setRegistryName("magenta_concrete_slab"));
            event.getRegistry().register(new BlockItem(ModBlocks.MAGENTACONCSTAIR, properties).setRegistryName("magenta_concrete_stairs"));
            event.getRegistry().register(new BlockItem(ModBlocks.LIGHTBLUECONCSLAB, properties).setRegistryName("light_blue_concrete_slab"));
            event.getRegistry().register(new BlockItem(ModBlocks.LIGHTBLUECONCSTAIR, properties).setRegistryName("light_blue_concrete_stairs"));
            event.getRegistry().register(new BlockItem(ModBlocks.YELLOWCONCSLAB, properties).setRegistryName("yellow_concrete_slab"));
            event.getRegistry().register(new BlockItem(ModBlocks.YELLOWCONCSTAIR, properties).setRegistryName("yellow_concrete_stairs"));
            event.getRegistry().register(new BlockItem(ModBlocks.LIMECONCSLAB, properties).setRegistryName("lime_concrete_slab"));
            event.getRegistry().register(new BlockItem(ModBlocks.LIMECONCSTAIR, properties).setRegistryName("lime_concrete_stairs"));
            event.getRegistry().register(new BlockItem(ModBlocks.PINKCONCSLAB, properties).setRegistryName("pink_concrete_slab"));
            event.getRegistry().register(new BlockItem(ModBlocks.PINKCONCSTAIR, properties).setRegistryName("pink_concrete_stairs"));
            event.getRegistry().register(new BlockItem(ModBlocks.GRAYCONCSLAB, properties).setRegistryName("gray_concrete_slab"));
            event.getRegistry().register(new BlockItem(ModBlocks.GRAYCONCSTAIR, properties).setRegistryName("gray_concrete_stairs"));
            event.getRegistry().register(new BlockItem(ModBlocks.LIGHTGRAYCONCSLAB, properties).setRegistryName("light_gray_concrete_slab"));
            event.getRegistry().register(new BlockItem(ModBlocks.LIGHTGRAYCONCSTAIR, properties).setRegistryName("light_gray_concrete_stairs"));
            event.getRegistry().register(new BlockItem(ModBlocks.CYANCONCSLAB, properties).setRegistryName("cyan_concrete_slab"));
            event.getRegistry().register(new BlockItem(ModBlocks.CYANCONCSTAIR, properties).setRegistryName("cyan_concrete_stairs"));
            event.getRegistry().register(new BlockItem(ModBlocks.PURPLECONCSLAB, properties).setRegistryName("purple_concrete_slab"));
            event.getRegistry().register(new BlockItem(ModBlocks.PURPLECONCSTAIR, properties).setRegistryName("purple_concrete_stairs"));
            event.getRegistry().register(new BlockItem(ModBlocks.BLUECONCSLAB, properties).setRegistryName("blue_concrete_slab"));
            event.getRegistry().register(new BlockItem(ModBlocks.BLUECONCSTAIR, properties).setRegistryName("blue_concrete_stairs"));
            event.getRegistry().register(new BlockItem(ModBlocks.BROWNCONCSLAB, properties).setRegistryName("brown_concrete_slab"));
            event.getRegistry().register(new BlockItem(ModBlocks.BROWNCONCSTAIR, properties).setRegistryName("brown_concrete_stairs"));
            event.getRegistry().register(new BlockItem(ModBlocks.GREENCONCSLAB, properties).setRegistryName("green_concrete_slab"));
            event.getRegistry().register(new BlockItem(ModBlocks.GREENCONCSTAIR, properties).setRegistryName("green_concrete_stairs"));
            event.getRegistry().register(new BlockItem(ModBlocks.REDCONCSLAB, properties).setRegistryName("red_concrete_slab"));
            event.getRegistry().register(new BlockItem(ModBlocks.REDCONCSTAIR, properties).setRegistryName("red_concrete_stairs"));
            event.getRegistry().register(new BlockItem(ModBlocks.BLACKCONCSLAB, properties).setRegistryName("black_concrete_slab"));
            event.getRegistry().register(new BlockItem(ModBlocks.BLACKCONCSTAIR, properties).setRegistryName("black_concrete_stairs"));

            event.getRegistry().register(new BlockItem(ModBlocks.STALAGMITE, properties).setRegistryName("stalagmite"));
            event.getRegistry().register(new BlockItem(ModBlocks.STALACTITE, properties).setRegistryName("stalactite"));

            event.getRegistry().register(new BlockItem(ModBlocks.OBSIDIAN_DOOR, properties).setRegistryName("obsidian_door"));

            event.getRegistry().register(new EmeraldPickaxe());
            event.getRegistry().register(new EmeraldAxe());
            event.getRegistry().register(new EmeraldShovel());
            event.getRegistry().register(new EmeraldSword());
            event.getRegistry().register(new EmeraldHoe());
            event.getRegistry().register(new EmeraldHelmet());
            event.getRegistry().register(new EmeraldChestplate());
            event.getRegistry().register(new EmeraldLeggings());
            event.getRegistry().register(new EmeraldBoots());
            event.getRegistry().register(new EmeraldHorseArmour());

            event.getRegistry().register(new ObsidianPickaxe());
            event.getRegistry().register(new ObsidianAxe());
            event.getRegistry().register(new ObsidianShovel());
            event.getRegistry().register(new ObsidianSword());
            event.getRegistry().register(new ObsidianHoe());
            event.getRegistry().register(new ObsidianHelmet());
            event.getRegistry().register(new ObsidianChestplate());
            event.getRegistry().register(new ObsidianLeggings());
            event.getRegistry().register(new ObsidianBoots());
            event.getRegistry().register(new ObsidianHorseArmour());

            event.getRegistry().register(new LapisPickaxe());
            event.getRegistry().register(new LapisAxe());
            event.getRegistry().register(new LapisShovel());
            event.getRegistry().register(new LapisSword());
            event.getRegistry().register(new LapisHoe());
            event.getRegistry().register(new LapisHelmet());
            event.getRegistry().register(new LapisChestplate());
            event.getRegistry().register(new LapisLeggings());
            event.getRegistry().register(new LapisBoots());
            event.getRegistry().register(new LapisHorseArmour());

            event.getRegistry().register(new RedstonePickaxe());
            event.getRegistry().register(new RedstoneAxe());
            event.getRegistry().register(new RedstoneShovel());
            event.getRegistry().register(new RedstoneSword());
            event.getRegistry().register(new RedstoneHoe());
            event.getRegistry().register(new RedstoneHelmet());
            event.getRegistry().register(new RedstoneChestplate());
            event.getRegistry().register(new RedstoneLeggings());
            event.getRegistry().register(new RedstoneBoots());
            event.getRegistry().register(new RedstoneHorseArmour());

            event.getRegistry().register(new QuartzPickaxe());
            event.getRegistry().register(new QuartzAxe());
            event.getRegistry().register(new QuartzShovel());
            event.getRegistry().register(new QuartzSword());
            event.getRegistry().register(new QuartzHoe());
            event.getRegistry().register(new QuartzHelmet());
            event.getRegistry().register(new QuartzChestplate());
            event.getRegistry().register(new QuartzLeggings());
            event.getRegistry().register(new QuartzBoots());
            event.getRegistry().register(new QuartzHorseArmour());

            event.getRegistry().register(new NetherBrickPickaxe());
            event.getRegistry().register(new NetherBrickAxe());
            event.getRegistry().register(new NetherBrickShovel());
            event.getRegistry().register(new NetherBrickSword());
            event.getRegistry().register(new NetherBrickHoe());

            event.getRegistry().register(new ChainmailSheet());
            event.getRegistry().register(new ChainmailHorseArmour());

            event.getRegistry().register(new Calamari());
            event.getRegistry().register(new CalamariCooked());
            event.getRegistry().register(new HorseRaw());
            event.getRegistry().register(new HorseCooked());
            event.getRegistry().register(new WhiteChocolate());
            event.getRegistry().register(new MilkChocolate());
            event.getRegistry().register(new DarkChocolate());

            event.getRegistry().register(new Ender_Dragon_Spawn_Egg());
            event.getRegistry().register(new Wither_Spawn_Egg());
            event.getRegistry().register(new Giant_Zombie_Spawn_Egg());
            event.getRegistry().register(new Illusioner_Spawn_Egg());
            event.getRegistry().register(new Snow_Golem_Spawn_Egg());
            event.getRegistry().register(new Iron_Golem_Spawn_Egg());
        }

    }
}