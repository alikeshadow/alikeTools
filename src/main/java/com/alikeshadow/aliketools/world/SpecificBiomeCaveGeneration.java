package com.alikeshadow.aliketools.world;

import com.alikeshadow.aliketools.blocks.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.BlockWithContextConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;

public class SpecificBiomeCaveGeneration {
    public static void setupSpecificBiomeGen(){

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

        for(Biome biome : ForgeRegistries.BIOMES) {

            if (biome.getCategory() == Biome.Category.JUNGLE) {
                biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.VINES.withConfiguration(
                        new NoFeatureConfig()
                ));
            }

            if (biome.getCategory() == Biome.Category.DESERT) {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Blocks.SANDSTONE.getDefaultState(), (int)(Math.random() * 15 + 3)))
                        .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(400, 5, 5, 90)))  //per chunk, height from layer 0, height from top layer, max spawn height
                );
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Blocks.SAND.getDefaultState(), (int)(Math.random() * 10 + 3)))
                        .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(30, 20, 5, 70)))  //per chunk, height from layer 0, height from top layer, max spawn height
                );
            }

            if (biome.getCategory() == Biome.Category.TAIGA || biome.getCategory() == Biome.Category.ICY) {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.SIMPLE_BLOCK.withConfiguration(
                        new BlockWithContextConfig(Blocks.SNOW.getDefaultState(), placeOnS, placeInS, placeUnderS))
                        .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(900, 5, 5, 100)))  //per chunk, height from layer 0, height from top layer, max spawn height
                );
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Blocks.SNOW_BLOCK.getDefaultState(), (int)(Math.random() * 15 + 5)))
                        .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(40, 15, 5, 80)))  //per chunk, height from layer 0, height from top layer, max spawn height
                );
            }

            if (biome.getCategory() == Biome.Category.ICY) {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Blocks.PACKED_ICE.getDefaultState(), (int)(Math.random() * 15 + 5)))
                        .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(30, 15, 5, 80)))  //per chunk, height from layer 0, height from top layer, max spawn height
                );
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Blocks.BLUE_ICE.getDefaultState(), (int)(Math.random() * 10 + 2)))
                        .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(70, 10, 5, 80)))  //per chunk, height from layer 0, height from top layer, max spawn height
                );
            }

            if (biome.getCategory() == Biome.Category.MESA) {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Blocks.BROWN_TERRACOTTA.getDefaultState(), (int)(Math.random() * 15 + 5)))
                        .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(50, 5, 5, 90)))  //per chunk, height from layer 0, height from top layer, max spawn height
                );
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Blocks.TERRACOTTA.getDefaultState(), (int)(Math.random() * 15 + 5)))
                        .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(50, 5, 5, 90)))  //per chunk, height from layer 0, height from top layer, max spawn height
                );
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Blocks.ORANGE_TERRACOTTA.getDefaultState(), (int)(Math.random() * 15 + 5)))
                        .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(50, 5, 5, 90)))  //per chunk, height from layer 0, height from top layer, max spawn height
                );
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Blocks.WHITE_TERRACOTTA.getDefaultState(), (int)(Math.random() * 15 + 5)))
                        .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(50, 5, 5, 90)))  //per chunk, height from layer 0, height from top layer, max spawn height
                );
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Blocks.RED_TERRACOTTA.getDefaultState(), (int)(Math.random() * 15 + 5)))
                        .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(50, 5, 5, 90)))  //per chunk, height from layer 0, height from top layer, max spawn height
                );
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Blocks.RED_SAND.getDefaultState(), (int)(Math.random() * 10 + 3)))
                        .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(20, 5, 5, 90)))  //per chunk, height from layer 0, height from top layer, max spawn height
                );
            }

            if (biome.getCategory() == Biome.Category.SWAMP) {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Blocks.CLAY.getDefaultState(), (int)(Math.random() * 15 + 5)))
                        .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(100, 5, 5, 90)))  //per chunk, height from layer 0, height from top layer, max spawn height
                );
            }

            if (biome.getCategory() == Biome.Category.RIVER) {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Blocks.CLAY.getDefaultState(), (int)(Math.random() * 15 + 5)))
                        .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(100, 5, 5, 90)))  //per chunk, height from layer 0, height from top layer, max spawn height
                );
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Blocks.SAND.getDefaultState(), (int)(Math.random() * 10 + 3)))
                        .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(30, 5, 5, 90)))  //per chunk, height from layer 0, height from top layer, max spawn height
                );
            }

            if (biome.getCategory() == Biome.Category.BEACH || biome.getCategory() == Biome.Category.OCEAN) {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Blocks.GRAVEL.getDefaultState(), (int)(Math.random() * 10 + 3)))
                        .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(30, 5, 5, 90)))  //per chunk, height from layer 0, height from top layer, max spawn height
                );
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Blocks.SAND.getDefaultState(), (int)(Math.random() * 10 + 3)))
                        .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(30, 5, 5, 90)))  //per chunk, height from layer 0, height from top layer, max spawn height
                );
            }

            if (biome.getCategory() == Biome.Category.SAVANNA) {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Blocks.COARSE_DIRT.getDefaultState(), (int)(Math.random() * 15 + 5)))
                        .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(100, 5, 5, 90)))  //per chunk, height from layer 0, height from top layer, max spawn height
                );
            }

        }
    }
}
