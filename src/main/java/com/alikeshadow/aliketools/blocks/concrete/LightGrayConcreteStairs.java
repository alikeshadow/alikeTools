package com.alikeshadow.aliketools.blocks.concrete;

import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.DyeColor;

public class LightGrayConcreteStairs extends StairsBlock {
    public LightGrayConcreteStairs() {
    super(Blocks.LIGHT_GRAY_CONCRETE.getDefaultState(),
                Properties.create(Material.ROCK, DyeColor.LIGHT_GRAY)
                        .sound(SoundType.STONE)
                        .hardnessAndResistance(1.8F)
        );
        setRegistryName("light_gray_concrete_stairs");
    }
}