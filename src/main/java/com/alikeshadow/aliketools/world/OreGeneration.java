package com.alikeshadow.aliketools.world;

import com.alikeshadow.aliketools.blocks.ModBlocks;
import com.alikeshadow.aliketools.setup.Config;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.structure.StructureManager;
import net.minecraft.world.gen.placement.CountPlacement;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class OreGeneration {
    private static final Logger LOGGER = LogManager.getLogger();

    public static void setupOreGeneration() {
        for(Biome biome : ForgeRegistries.BIOMES){

            if (Config.MULTIORE_GENERATION.get()) {
                if (biome.getCategory() == Biome.Category.THEEND || biome.getCategory() == Biome.Category.NETHER) {
                    LOGGER.info("No MultiOre in the End or Nether");
                }
                else{
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                            new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.MULTIORE.getDefaultState(), (int)(Math.random() * 4 + 1)))
                            .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Config.STALACTITE_PER_CHUNK.get(), 5, 15, 90)))  //per chunk, height from layer 0, height from top layer, max spawn height
                    );
                }
            }

        }
    }
}
