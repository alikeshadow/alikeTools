package com.alikeshadow.aliketools.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.state.properties.SlabType;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class GlassSlab extends SlabBlock {
    public GlassSlab() {
        super(Properties.create(Material.GLASS)
                .sound(SoundType.GLASS)
                .hardnessAndResistance(0.3F)
                .notSolid()
        );
        setRegistryName("glassslab");
    }
    @OnlyIn(Dist.CLIENT)
    public float getAmbientOcclusionLightValue(BlockState p_220080_1_, IBlockReader p_220080_2_, BlockPos p_220080_3_) {
        return 1.0F;
    }
    @Override
    public boolean propagatesSkylightDown(BlockState p_200123_1_, IBlockReader p_200123_2_, BlockPos p_200123_3_) {
        return true;
    }
    @OnlyIn(Dist.CLIENT)
    public boolean isSideInvisible(BlockState state, BlockState adjacentBlockState, Direction side) {
        SlabType slabtype = state.get(TYPE);
        if (slabtype == SlabType.DOUBLE) {
            return super.isSideInvisible(state, adjacentBlockState, side);
        }
        else {
            return adjacentBlockState.getBlock() == this || super.isSideInvisible(state, adjacentBlockState, side);
        }
    }

}