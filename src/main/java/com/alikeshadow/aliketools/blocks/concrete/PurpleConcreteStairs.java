package com.alikeshadow.aliketools.blocks.concrete;

import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.DyeColor;

public class PurpleConcreteStairs extends StairsBlock {
    public PurpleConcreteStairs() {
    super(Blocks.PURPLE_CONCRETE.getDefaultState(),
                Properties.create(Material.ROCK, DyeColor.PURPLE)
                        .sound(SoundType.STONE)
                        .hardnessAndResistance(1.8F)
        );
        setRegistryName("purple_concrete_stairs");
    }
}