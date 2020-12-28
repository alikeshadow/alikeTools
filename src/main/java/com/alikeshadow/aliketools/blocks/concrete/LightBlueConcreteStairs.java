package com.alikeshadow.aliketools.blocks.concrete;

import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.DyeColor;

public class LightBlueConcreteStairs extends StairsBlock {
    public LightBlueConcreteStairs() {
    super(Blocks.LIGHT_BLUE_CONCRETE.getDefaultState(),
                Properties.create(Material.ROCK, DyeColor.LIGHT_BLUE)
                        .sound(SoundType.STONE)
                        .hardnessAndResistance(1.8F)
        );
        setRegistryName("light_blue_concrete_stairs");
    }
}