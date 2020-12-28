package com.alikeshadow.aliketools.blocks.concrete;

import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class OrangeConcreteSlab extends SlabBlock {
    public OrangeConcreteSlab() {
        super(Properties.create(Material.ROCK)
                .sound(SoundType.STONE)
                .hardnessAndResistance(1.8F)
        );
        setRegistryName("orange_concrete_slab");
    }
}