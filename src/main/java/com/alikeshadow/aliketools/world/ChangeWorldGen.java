package com.alikeshadow.aliketools.world;

import com.alikeshadow.aliketools.blocks.ModBlocks;
import com.alikeshadow.aliketools.setup.Config;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber
public class ChangeWorldGen {
    private static final ArrayList<ConfiguredFeature<?, ?>> oceanCaveGenStuff = new ArrayList<>();
    private static final ArrayList<ConfiguredFeature<?, ?>> normalCaveGenStuff = new ArrayList<>();
    private static final ArrayList<ConfiguredFeature<?, ?>> overworldOres = new ArrayList<>();
    private static final ArrayList<ConfiguredFeature<?, ?>> desertFeatureGen = new ArrayList<>();
    private static ConfiguredFeature<?,?> coldSnowGen;
    private static ConfiguredFeature<?,?> coldSnowBlockGen;
    private static ConfiguredFeature<?,?> icyPackedIceGen;
    private static ConfiguredFeature<?,?> icyBlueIceGen;
    private static final ArrayList<ConfiguredFeature<?, ?>> mesaFeatureGen = new ArrayList<>();
    private static ConfiguredFeature<?,?> swampriverClayGen;
    private static ConfiguredFeature<?,?> riverSandGen;
    private static final ArrayList<ConfiguredFeature<?, ?>> oceanFeatureGen = new ArrayList<>();
    private static ConfiguredFeature<?,?> savannahGen;

    public static void changeWorldGen(){
        final List<BlockState> placeIn = new ArrayList<>();
        placeIn.add(Blocks.CAVE_AIR.getDefaultState());
        placeIn.add(Blocks.WATER.getDefaultState());

        final List<BlockState> placeInW = new ArrayList<>();
        placeInW.add(Blocks.WATER.getDefaultState());

        final List<BlockState> placeOnSG = new ArrayList<>();
        placeOnSG.add(Blocks.STONE.getDefaultState());
        final List<BlockState> placeOnSC = new ArrayList<>();
        placeOnSC.add(Blocks.CAVE_AIR.getDefaultState());
        placeOnSC.add(Blocks.WATER.getDefaultState());

        final List<BlockState> placeUnderSC = new ArrayList<>();
        placeUnderSC.add(Blocks.STONE.getDefaultState());
        final List<BlockState> placeUnderSG = new ArrayList<>();
        placeUnderSG.add(Blocks.CAVE_AIR.getDefaultState());
        placeUnderSG.add(Blocks.WATER.getDefaultState());

        final List<BlockState> placeInS = new ArrayList<>();
        placeInS.add(Blocks.CAVE_AIR.getDefaultState());
        final List<BlockState> placeOnS = new ArrayList<>();
        placeOnS.add(Blocks.STONE.getDefaultState());
        placeOnS.add(Blocks.ANDESITE.getDefaultState());
        placeOnS.add(Blocks.GRANITE.getDefaultState());
        placeOnS.add(Blocks.DIORITE.getDefaultState());
        placeOnS.add(Blocks.COAL_ORE.getDefaultState());
        placeOnS.add(Blocks.IRON_ORE.getDefaultState());
        placeOnS.add(Blocks.REDSTONE_ORE.getDefaultState());
        placeOnS.add(Blocks.LAPIS_ORE.getDefaultState());
        placeOnS.add(Blocks.DIAMOND_ORE.getDefaultState());
        placeOnS.add(ModBlocks.MULTIORE.getDefaultState());
        final List<BlockState> placeUnderS = new ArrayList<>();
        placeUnderS.add(Blocks.CAVE_AIR.getDefaultState());

        if (Config.STALAGMITE_GENERATION.get()) {
            oceanCaveGenStuff.add(register("aliketools:stalagmite", Feature.SIMPLE_BLOCK.withConfiguration(
                    new BlockWithContextConfig(ModBlocks.STALAGMITE.getDefaultState().with(BlockStateProperties.WATERLOGGED, Boolean.TRUE), placeOnSG, placeInW, placeUnderSG))
                    .withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(5, 15, 90)))  //height from layer 0, height from top layer, max spawn height
                    .square().func_242731_b(Config.STALAGMITE_PER_CHUNK.get())) //Chunk spawn frequency
            );
            normalCaveGenStuff.add(register("aliketools:stalagmite", Feature.SIMPLE_BLOCK.withConfiguration(
                    new BlockWithContextConfig(ModBlocks.STALAGMITE.getDefaultState(), placeOnSG, placeIn, placeUnderSG))
                    .withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(5, 15, 90)))  //height from layer 0, height from top layer, max spawn height
                    .square().func_242731_b(Config.STALAGMITE_PER_CHUNK.get())) //Chunk spawn frequency
            );
        }

        if (Config.STALACTITE_GENERATION.get()) {
            oceanCaveGenStuff.add(register("aliketools:stalactite", Feature.SIMPLE_BLOCK.withConfiguration(
                    new BlockWithContextConfig(ModBlocks.STALACTITE.getDefaultState().with(BlockStateProperties.WATERLOGGED, Boolean.TRUE), placeOnSC, placeInW, placeUnderSC))
                    .withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(5, 15, 90)))  //height from layer 0, height from top layer, max spawn height
                    .square().func_242731_b(Config.STALACTITE_PER_CHUNK.get())) //Chunk spawn frequency
            );
            normalCaveGenStuff.add(register("aliketools:stalactite", Feature.SIMPLE_BLOCK.withConfiguration(
                    new BlockWithContextConfig(ModBlocks.STALACTITE.getDefaultState(), placeOnSC, placeIn, placeUnderSC))
                    .withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(5, 15, 90)))  //height from layer 0, height from top layer, max spawn height
                    .square().func_242731_b(Config.STALACTITE_PER_CHUNK.get())) //Chunk spawn frequency
            );
        }

        if (Config.MULTIORE_GENERATION.get()) {
            overworldOres.add(register("aliketools:multiore", Feature.ORE.withConfiguration(
                    new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, ModBlocks.MULTIORE.getDefaultState(), (int) (Math.random() * 4 + 1))) //Vein Size
                    .withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(5, 15, 90)))  //height from layer 0, height from top layer, max spawn height
                    .square().func_242731_b(Config.MULTIORE_PER_CHUNK.get())) //Chunk spawn frequency
            );
        }


        desertFeatureGen.add(register("sandstone", Feature.ORE.withConfiguration(
                new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, Blocks.SANDSTONE.getDefaultState(), (int)(Math.random() * 15 + 3)))
                .withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(5, 5, 90)))  //height from layer 0, height from top layer, max spawn height
                .square().func_242731_b(400))); //Chunk spawn frequency
        desertFeatureGen.add(register("sand", Feature.ORE.withConfiguration(
                new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, Blocks.SAND.getDefaultState(), (int)(Math.random() * 15 + 3)))
                .withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(20, 5, 70)))  //height from layer 0, height from top layer, max spawn height
                .square().func_242731_b(30))); //Chunk spawn frequency

        coldSnowGen =(register("snow", Feature.SIMPLE_BLOCK.withConfiguration(
                new BlockWithContextConfig(Blocks.SNOW.getDefaultState(), placeOnS, placeInS, placeUnderS))
                .withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(5, 5, 100)))  //height from layer 0, height from top layer, max spawn height
                .square().func_242731_b(900))); //Chunk spawn frequency
        coldSnowBlockGen =(register("snow_block", Feature.ORE.withConfiguration(
                new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, Blocks.SNOW_BLOCK.getDefaultState(), (int)(Math.random() * 15 + 5)))
                .withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(15, 5, 80)))  //height from layer 0, height from top layer, max spawn height
                .square().func_242731_b(40))); //Chunk spawn frequency
        icyPackedIceGen =(register("packed_ice", Feature.ORE.withConfiguration(
                new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, Blocks.PACKED_ICE.getDefaultState(), (int)(Math.random() * 15 + 5)))
                .withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(15, 5, 80)))  //height from layer 0, height from top layer, max spawn height
                .square().func_242731_b(30))); //Chunk spawn frequency
        icyBlueIceGen =(register("blue_ice", Feature.ORE.withConfiguration(
                new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, Blocks.BLUE_ICE.getDefaultState(), (int)(Math.random() * 10 + 2)))
                .withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(10, 5, 80)))  //height from layer 0, height from top layer, max spawn height
                .square().func_242731_b(70))); //Chunk spawn frequency

        mesaFeatureGen.add(register("brown_terracotta", Feature.ORE.withConfiguration(
                new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, Blocks.BROWN_TERRACOTTA.getDefaultState(), (int)(Math.random() * 15 + 5)))
                .withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(5, 5, 90)))  //height from layer 0, height from top layer, max spawn height
                .square().func_242731_b(50))); //Chunk spawn frequency
        mesaFeatureGen.add(register("terracotta", Feature.ORE.withConfiguration(
                new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, Blocks.TERRACOTTA.getDefaultState(), (int)(Math.random() * 15 + 5)))
                .withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(5, 5, 90)))  //height from layer 0, height from top layer, max spawn height
                .square().func_242731_b(50))); //Chunk spawn frequency
        mesaFeatureGen.add(register("orange_terracotta", Feature.ORE.withConfiguration(
                new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, Blocks.ORANGE_TERRACOTTA.getDefaultState(), (int)(Math.random() * 15 + 5)))
                .withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(5, 5, 90)))  //height from layer 0, height from top layer, max spawn height
                .square().func_242731_b(50))); //Chunk spawn frequency
        mesaFeatureGen.add(register("white_terracotta", Feature.ORE.withConfiguration(
                new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, Blocks.WHITE_TERRACOTTA.getDefaultState(), (int)(Math.random() * 15 + 5)))
                .withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(5, 5, 90)))  //height from layer 0, height from top layer, max spawn height
                .square().func_242731_b(50))); //Chunk spawn frequency
        mesaFeatureGen.add(register("red_terracotta", Feature.ORE.withConfiguration(
                new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, Blocks.RED_TERRACOTTA.getDefaultState(), (int)(Math.random() * 15 + 5)))
                .withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(5, 5, 90)))  //height from layer 0, height from top layer, max spawn height
                .square().func_242731_b(50))); //Chunk spawn frequency
        mesaFeatureGen.add(register("red_sand", Feature.ORE.withConfiguration(
                new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, Blocks.RED_SAND.getDefaultState(), (int)(Math.random() * 10 + 3)))
                .withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(5, 5, 90)))  //height from layer 0, height from top layer, max spawn height
                .square().func_242731_b(20))); //Chunk spawn frequency

        swampriverClayGen =(register("clay", Feature.ORE.withConfiguration(
                new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, Blocks.CLAY.getDefaultState(), (int)(Math.random() * 15 + 5)))
                .withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(5, 5, 90)))  //height from layer 0, height from top layer, max spawn height
                .square().func_242731_b(100))); //Chunk spawn frequency
        riverSandGen =(register("sand", Feature.ORE.withConfiguration(
                new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, Blocks.SAND.getDefaultState(), (int)(Math.random() * 10 + 5)))
                .withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(5, 5, 90)))  //height from layer 0, height from top layer, max spawn height
                .square().func_242731_b(30))); //Chunk spawn frequency

        oceanFeatureGen.add(register("gravel", Feature.ORE.withConfiguration(
                new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, Blocks.GRAVEL.getDefaultState(), (int)(Math.random() * 10 + 3)))
                .withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(5, 5, 90)))  //height from layer 0, height from top layer, max spawn height
                .square().func_242731_b(30))); //Chunk spawn frequency
        oceanFeatureGen.add(register("sand", Feature.ORE.withConfiguration(
                new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, Blocks.SAND.getDefaultState(), (int)(Math.random() * 10 + 3)))
                .withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(5, 5, 90)))  //height from layer 0, height from top layer, max spawn height
                .square().func_242731_b(30))); //Chunk spawn frequency

        savannahGen =(register("coarse_dirt", Feature.ORE.withConfiguration(
                new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, Blocks.COARSE_DIRT.getDefaultState(), (int)(Math.random() * 15 + 5)))
                .withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(5, 5, 90)))  //height from layer 0, height from top layer, max spawn height
                .square().func_242731_b(100))); //Chunk spawn frequency
        //.func_242730_a(new FeatureSpread(1,100)))); //Chunk spawn frequency

    }

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void gen(BiomeLoadingEvent event) {
        BiomeGenerationSettingsBuilder generation = event.getGeneration();

        if(!event.getCategory().equals(Biome.Category.THEEND) || !event.getCategory().equals(Biome.Category.THEEND)) {

            // ORES
            for (ConfiguredFeature<?, ?> ore : overworldOres) {
                generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ore);
            }

            // STALAC and STALAG
            if (event.getCategory().equals(Biome.Category.OCEAN)) {
                for (ConfiguredFeature<?, ?> features : oceanCaveGenStuff) {
                    generation.withFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, features);
                }

            } else {
                for (ConfiguredFeature<?, ?> features : normalCaveGenStuff) {
                    generation.withFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, features);
                }
            }

            // BLOCKS
            if (event.getCategory().equals(Biome.Category.DESERT)) {
                for (ConfiguredFeature<?, ?> ore : desertFeatureGen) {
                    generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ore);
                }
            }
            if (event.getCategory().equals(Biome.Category.ICY) || event.getCategory().equals(Biome.Category.TAIGA)) {
                generation.withFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, coldSnowGen);
                generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, coldSnowBlockGen);
                if (event.getCategory().equals(Biome.Category.ICY)) {
                    generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, icyPackedIceGen);
                    generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, icyBlueIceGen);
                }
            }
            if (event.getCategory().equals(Biome.Category.MESA)) {
                for (ConfiguredFeature<?, ?> ore : mesaFeatureGen) {
                    generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ore);
                }
            }
            if (event.getCategory().equals(Biome.Category.SWAMP) || event.getCategory().equals(Biome.Category.RIVER)) {
                generation.withFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, swampriverClayGen);
                if (event.getCategory().equals(Biome.Category.RIVER)) {
                    generation.withFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, riverSandGen);
                }
            }
            if (event.getCategory().equals(Biome.Category.BEACH) || event.getCategory().equals(Biome.Category.OCEAN)) {
                for (ConfiguredFeature<?, ?> ore : oceanFeatureGen) {
                    generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ore);
                }
            }
            if (event.getCategory().equals(Biome.Category.SAVANNA)) {
                generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, savannahGen);
            }
        }
    }

    private static <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String name, ConfiguredFeature<FC, ?> configuredFeature) {
        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, name, configuredFeature);
    }
}