package com.alikeshadow.aliketools.blocks.concrete;

import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.DyeColor;

public class PinkConcreteStairs extends StairsBlock {
    public PinkConcreteStairs() {
    super(Blocks.PINK_CONCRETE.getDefaultState(),
                Properties.create(Material.ROCK, DyeColor.PINK)
                        .sound(SoundType.STONE)
                        .hardnessAndResistance(1.8F)
        );
        setRegistryName("pink_concrete_stairs");
    }
}