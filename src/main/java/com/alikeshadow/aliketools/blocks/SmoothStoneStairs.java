package com.alikeshadow.aliketools.blocks;

import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.material.Material;

public class SmoothStoneStairs extends StairsBlock {
    public SmoothStoneStairs() {
        super(Blocks.SMOOTH_STONE.getDefaultState(),
                Properties.create(Material.ROCK)
                        .sound(SoundType.STONE)
                        .hardnessAndResistance(2.0F, 6.0F)
        );
        setRegistryName("smoothstonestairs");
    }
}