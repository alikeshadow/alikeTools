package com.alikeshadow.aliketools.blocks.concrete;

import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.DyeColor;

public class BrownConcreteSlab extends SlabBlock {
    public BrownConcreteSlab() {
        super(Properties.create(Material.ROCK, DyeColor.BROWN)
                .sound(SoundType.STONE)
                .hardnessAndResistance(1.8F)
        );
        setRegistryName("brown_concrete_slab");
    }
}