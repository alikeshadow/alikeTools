package com.alikeshadow.aliketools.blocks.concrete;

import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.DyeColor;

public class LightGrayConcreteSlab extends SlabBlock {
    public LightGrayConcreteSlab() {
        super(Properties.create(Material.ROCK, DyeColor.LIGHT_GRAY)
                .sound(SoundType.STONE)
                .hardnessAndResistance(1.8F)
        );
        setRegistryName("light_gray_concrete_slab");
    }
}