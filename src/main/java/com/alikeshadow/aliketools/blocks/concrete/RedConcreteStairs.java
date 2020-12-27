package com.alikeshadow.aliketools.blocks.concrete;

import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.DyeColor;

public class RedConcreteStairs extends StairsBlock {
    public RedConcreteStairs() {
    super(Blocks.RED_CONCRETE.getDefaultState(),
                Properties.create(Material.ROCK, DyeColor.RED)
                        .sound(SoundType.STONE)
                        .hardnessAndResistance(1.8F)
        );
        setRegistryName("red_concrete_stairs");
    }
}