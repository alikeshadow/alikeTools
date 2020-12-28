package com.alikeshadow.aliketools.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class RedstoneSlab extends SlabBlock {
    public RedstoneSlab() {
        super(Properties.create(Material.IRON)
                .sound(SoundType.METAL)
                .hardnessAndResistance(5.0F, 6.0F)
        );
        setRegistryName("redstoneslab");
    }
    @Override
    public int getWeakPower(BlockState blockState, IBlockReader blockAccess, BlockPos pos, Direction side) { return 15; }
    public boolean canProvidePower(BlockState state) {
        return true;
    }
}