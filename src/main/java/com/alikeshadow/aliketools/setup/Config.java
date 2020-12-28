package com.alikeshadow.aliketools.setup;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import java.nio.file.Path;

@Mod.EventBusSubscriber
public class Config {
    private static final String CATEGORY_SPELEOTHEM = "speleothem";
    private static final String CATEGORY_DROPS = "drops";
    private static final String CATEGORY_MULTIORE = "multiore";
    private static final String CATEGORY_BLOCKS = "blocks";

    private static final ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder();
    public static ForgeConfigSpec COMMON_CONFIG;

    public static ForgeConfigSpec.BooleanValue MULTIORE_GENERATION;
    public static ForgeConfigSpec.IntValue MULTIORE_PER_CHUNK;
    public static ForgeConfigSpec.BooleanValue CALAMARI_DROP;
    public static ForgeConfigSpec.BooleanValue RAW_HORSE_DROP;
    public static ForgeConfigSpec.BooleanValue ZPIGMEN_DROP_PORKCHOPS;
    public static ForgeConfigSpec.BooleanValue STALAGMITE_GENERATION;
    public static ForgeConfigSpec.IntValue STALAGMITE_PER_CHUNK;
    public static ForgeConfigSpec.BooleanValue STALACTITE_GENERATION;
    public static ForgeConfigSpec.IntValue STALACTITE_PER_CHUNK;

    static {
        COMMON_BUILDER.comment("Drop settings").push(CATEGORY_DROPS);
        CALAMARI_DROP = COMMON_BUILDER.comment("Squids drop calamari:").define("calamari_drop",true);
        RAW_HORSE_DROP = COMMON_BUILDER.comment("Horses drop meat:").define("horse_drop",true);
        ZPIGMEN_DROP_PORKCHOPS = COMMON_BUILDER.comment("Zombie-Pigmen drop porkchops:").define("zpigmen_drop_porkchops",true);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("MultiOre").push(CATEGORY_MULTIORE);
        MULTIORE_GENERATION = COMMON_BUILDER.comment("Generate multiore:").define("generate_multiore",true);
        MULTIORE_PER_CHUNK = COMMON_BUILDER.comment("Veins per chunk:").defineInRange("multiore_per_chunk",5,1, Integer.MAX_VALUE);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Speleothem").push(CATEGORY_SPELEOTHEM);
        STALAGMITE_GENERATION = COMMON_BUILDER.comment("Generate stalagmites:").define("generate_stalags",true);
        STALAGMITE_PER_CHUNK = COMMON_BUILDER.comment("Stalagmites per chunk:").defineInRange("stalag_per_chunk",99,1, Integer.MAX_VALUE);
        STALACTITE_GENERATION = COMMON_BUILDER.comment("Generate stalactites:").define("generate_stalacs",true);
        STALACTITE_PER_CHUNK = COMMON_BUILDER.comment("Stalactites per chunk:").defineInRange("stalac_per_chunk",99,1, Integer.MAX_VALUE);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Blocks").push(CATEGORY_BLOCKS);
        COMMON_BUILDER.pop();

        COMMON_CONFIG = COMMON_BUILDER.build();
    }

    public static void loadConfig(ForgeConfigSpec spec, Path path) {
        final CommentedFileConfig configData = CommentedFileConfig.builder(path)
                .sync()
                .autosave()
                .writingMode(WritingMode.REPLACE)
                .build();
        configData.load();
        spec.setConfig(configData);
    }

    @SubscribeEvent
    public static void onLoad(final ModConfig.Loading configEvent) {
    }

    @SubscribeEvent
    public static void onReload(final ModConfig.Reloading configEvent) {
    }

}