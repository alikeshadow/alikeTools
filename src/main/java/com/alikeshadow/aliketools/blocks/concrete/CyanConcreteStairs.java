package com.alikeshadow.aliketools.blocks.concrete;

import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.DyeColor;

public class CyanConcreteStairs extends StairsBlock {
    public CyanConcreteStairs() {
    super(Blocks.CYAN_CONCRETE.getDefaultState(),
                Properties.create(Material.ROCK, DyeColor.CYAN)
                        .sound(SoundType.STONE)
                        .hardnessAndResistance(1.8F)
        );
        setRegistryName("cyan_concrete_stairs");
    }
}