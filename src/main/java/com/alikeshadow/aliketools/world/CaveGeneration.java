package com.alikeshadow.aliketools.world;

import com.alikeshadow.aliketools.blocks.ModBlocks;
import com.alikeshadow.aliketools.setup.Config;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class CaveGeneration {
    private static final Logger LOGGER = LogManager.getLogger();
    public static void setupCaveGeneration(){

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

        for(Biome biome : ForgeRegistries.BIOMES){
            if (biome.getCategory() == Biome.Category.NETHER) {
                LOGGER.info("No Cave features (yet!) in the Nether");
            }
            else if (biome.getCategory() == Biome.Category.THEEND) {
                LOGGER.info("No Cave features (yet!) in the End");
            }

            else if (biome.getCategory() == Biome.Category.OCEAN) {
                if (Config.STALAGMITE_GENERATION.get()) {
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.SIMPLE_BLOCK.func_225566_b_(
                            new BlockWithContextConfig(ModBlocks.STALAGMITE.getDefaultState().with(BlockStateProperties.WATERLOGGED, Boolean.TRUE), placeOnSG, placeInW, placeUnderSG))
                            .func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Config.STALAGMITE_PER_CHUNK.get(), 5, 15, 90)))  //per chunk, height from layer 0, height from top layer, max spawn height
                    );
                }
                if (Config.STALACTITE_GENERATION.get()) {
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.SIMPLE_BLOCK.func_225566_b_(
                            new BlockWithContextConfig(ModBlocks.STALACTITE.getDefaultState().with(BlockStateProperties.WATERLOGGED, Boolean.TRUE), placeOnSC, placeInW, placeUnderSC))
                            .func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Config.STALACTITE_PER_CHUNK.get(), 5, 15, 90)))  //per chunk, height from layer 0, height from top layer, max spawn height
                    );
                }
            }

            else {
                if (Config.STALAGMITE_GENERATION.get()) {
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.SIMPLE_BLOCK.func_225566_b_(
                            new BlockWithContextConfig(ModBlocks.STALAGMITE.getDefaultState(), placeOnSG, placeIn, placeUnderSG))
                            .func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Config.STALAGMITE_PER_CHUNK.get(), 5, 15, 90)))  //per chunk, height from layer 0, height from top layer, max spawn height
                    );
                }
                if (Config.STALACTITE_GENERATION.get()) {
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.SIMPLE_BLOCK.func_225566_b_(
                            new BlockWithContextConfig(ModBlocks.STALACTITE.getDefaultState(), placeOnSC, placeIn, placeUnderSC))
                            .func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Config.STALACTITE_PER_CHUNK.get(), 5, 15, 90)))  //per chunk, height from layer 0, height from top layer, max spawn height
                    );
                }
            }
        }
    }
}
