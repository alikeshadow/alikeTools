package com.alikeshadow.aliketools.blocks.concrete;

import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.DyeColor;

public class LimeConcreteStairs extends StairsBlock {
    public LimeConcreteStairs() {
    super(Blocks.LIME_CONCRETE.getDefaultState(),
                Properties.create(Material.ROCK, DyeColor.LIME)
                        .sound(SoundType.STONE)
                        .hardnessAndResistance(1.8F)
        );
        setRegistryName("lime_concrete_stairs");
    }
}