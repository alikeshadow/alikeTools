package com.alikeshadow.aliketools.blocks.concrete;

import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.DyeColor;

public class LimeConcreteSlab extends SlabBlock {
    public LimeConcreteSlab() {
        super(Properties.create(Material.ROCK, DyeColor.LIME)
                .sound(SoundType.STONE)
                .hardnessAndResistance(1.8F)
        );
        setRegistryName("lime_concrete_slab");
    }
}