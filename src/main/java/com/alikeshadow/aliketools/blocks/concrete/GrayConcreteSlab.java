package com.alikeshadow.aliketools.blocks.concrete;

import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.DyeColor;

public class GrayConcreteSlab extends SlabBlock {
    public GrayConcreteSlab() {
        super(Properties.create(Material.ROCK, DyeColor.GRAY)
                .sound(SoundType.STONE)
                .hardnessAndResistance(1.8F)
        );
        setRegistryName("gray_concrete_slab");
    }
}