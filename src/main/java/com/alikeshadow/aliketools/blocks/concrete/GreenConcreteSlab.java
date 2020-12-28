package com.alikeshadow.aliketools.blocks.concrete;

import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.DyeColor;

public class GreenConcreteSlab extends SlabBlock {
    public GreenConcreteSlab() {
        super(Properties.create(Material.ROCK, DyeColor.GREEN)
                .sound(SoundType.STONE)
                .hardnessAndResistance(1.8F)
        );
        setRegistryName("green_concrete_slab");
    }
}