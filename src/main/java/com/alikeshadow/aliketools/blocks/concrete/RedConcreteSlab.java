package com.alikeshadow.aliketools.blocks.concrete;

import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.DyeColor;

public class RedConcreteSlab extends SlabBlock {
    public RedConcreteSlab() {
        super(Properties.create(Material.ROCK, DyeColor.RED)
                .sound(SoundType.STONE)
                .hardnessAndResistance(1.8F)
        );
        setRegistryName("red_concrete_slab");
    }
}