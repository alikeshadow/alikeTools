package com.alikeshadow.aliketools.blocks.concrete;

import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.DyeColor;

public class BlackConcreteSlab extends SlabBlock {
    public BlackConcreteSlab() {
        super(Properties.create(Material.ROCK, DyeColor.BLACK)
                .sound(SoundType.STONE)
                .hardnessAndResistance(1.8F)
        );
        setRegistryName("black_concrete_slab");
    }
}