package com.alikeshadow.aliketools.blocks.concrete;

import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.DyeColor;

public class GreenConcreteStairs extends StairsBlock {
    public GreenConcreteStairs() {
    super(Blocks.GREEN_CONCRETE.getDefaultState(),
                Properties.create(Material.ROCK, DyeColor.GREEN)
                        .sound(SoundType.STONE)
                        .hardnessAndResistance(1.8F)
        );
        setRegistryName("green_concrete_stairs");
    }
}