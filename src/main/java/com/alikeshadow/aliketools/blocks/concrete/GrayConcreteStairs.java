package com.alikeshadow.aliketools.blocks.concrete;

import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.DyeColor;

public class GrayConcreteStairs extends StairsBlock {
    public GrayConcreteStairs() {
    super(Blocks.GRAY_CONCRETE.getDefaultState(),
                Properties.create(Material.ROCK, DyeColor.GRAY)
                        .sound(SoundType.STONE)
                        .hardnessAndResistance(1.8F)
        );
        setRegistryName("gray_concrete_stairs");
    }
}