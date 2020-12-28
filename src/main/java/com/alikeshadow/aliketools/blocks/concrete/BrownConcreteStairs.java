package com.alikeshadow.aliketools.blocks.concrete;

import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.DyeColor;

public class BrownConcreteStairs extends StairsBlock {
    public BrownConcreteStairs() {
    super(Blocks.BROWN_CONCRETE.getDefaultState(),
                Properties.create(Material.ROCK, DyeColor.BROWN)
                        .sound(SoundType.STONE)
                        .hardnessAndResistance(1.8F)
        );
        setRegistryName("brown_concrete_stairs");
    }
}