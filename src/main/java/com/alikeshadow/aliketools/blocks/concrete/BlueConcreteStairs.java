package com.alikeshadow.aliketools.blocks.concrete;

import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.DyeColor;

public class BlueConcreteStairs extends StairsBlock {
    public BlueConcreteStairs() {
    super(Blocks.BLUE_CONCRETE.getDefaultState(),
                Properties.create(Material.ROCK, DyeColor.BLUE)
                        .sound(SoundType.STONE)
                        .hardnessAndResistance(1.8F)
        );
        setRegistryName("blue_concrete_stairs");
    }
}