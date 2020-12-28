package com.alikeshadow.aliketools.blocks.concrete;

import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.DyeColor;

public class CyanConcreteSlab extends SlabBlock {
    public CyanConcreteSlab() {
        super(Properties.create(Material.ROCK, DyeColor.CYAN)
                .sound(SoundType.STONE)
                .hardnessAndResistance(1.8F)
        );
        setRegistryName("cyan_concrete_slab");
    }
}