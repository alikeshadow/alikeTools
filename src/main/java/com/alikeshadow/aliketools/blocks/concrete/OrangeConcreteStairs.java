package com.alikeshadow.aliketools.blocks.concrete;

import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.DyeColor;

public class OrangeConcreteStairs extends StairsBlock {
    public OrangeConcreteStairs() {
    super(Blocks.ORANGE_CONCRETE.getDefaultState(),
                Properties.create(Material.ROCK, DyeColor.ORANGE)
                        .sound(SoundType.STONE)
                        .hardnessAndResistance(1.8F)
        );
        setRegistryName("orange_concrete_stairs");
    }
}