package com.alikeshadow.aliketools.blocks.concrete;

import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.DyeColor;

public class WhiteConcreteStairs extends StairsBlock {
    public WhiteConcreteStairs() {
    super(Blocks.WHITE_CONCRETE.getDefaultState(),
                Properties.create(Material.ROCK, DyeColor.WHITE)
                        .sound(SoundType.STONE)
                        .hardnessAndResistance(1.8F)
        );
        setRegistryName("white_concrete_stairs");
    }
}