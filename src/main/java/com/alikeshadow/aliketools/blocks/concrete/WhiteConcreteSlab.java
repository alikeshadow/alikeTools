package com.alikeshadow.aliketools.blocks.concrete;

import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.DyeColor;

public class WhiteConcreteSlab extends SlabBlock {
    public WhiteConcreteSlab() {
        super(Properties.create(Material.ROCK, DyeColor.WHITE)
                .sound(SoundType.STONE)
                .hardnessAndResistance(1.8F)
        );
        setRegistryName("white_concrete_slab");
    }
}