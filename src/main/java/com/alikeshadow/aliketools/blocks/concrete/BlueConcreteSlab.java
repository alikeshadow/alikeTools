package com.alikeshadow.aliketools.blocks.concrete;

import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.DyeColor;

public class BlueConcreteSlab extends SlabBlock {
    public BlueConcreteSlab() {
        super(Properties.create(Material.ROCK, DyeColor.BLUE)
                .sound(SoundType.STONE)
                .hardnessAndResistance(1.8F)
        );
        setRegistryName("blue_concrete_slab");
    }
}