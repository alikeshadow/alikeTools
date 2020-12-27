package com.alikeshadow.aliketools.blocks.concrete;

import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.DyeColor;

public class YellowConcreteStairs extends StairsBlock {
    public YellowConcreteStairs() {
    super(Blocks.YELLOW_CONCRETE.getDefaultState(),
                Properties.create(Material.ROCK, DyeColor.YELLOW)
                        .sound(SoundType.STONE)
                        .hardnessAndResistance(1.8F)
        );
        setRegistryName("yellow_concrete_stairs");
    }
}