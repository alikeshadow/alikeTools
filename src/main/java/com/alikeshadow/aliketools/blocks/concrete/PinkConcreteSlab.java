package com.alikeshadow.aliketools.blocks.concrete;

import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class PinkConcreteSlab extends SlabBlock {
    public PinkConcreteSlab() {
        super(Properties.create(Material.ROCK)
                .sound(SoundType.STONE)
                .hardnessAndResistance(1.8F)
        );
        setRegistryName("pink_concrete_slab");
    }
}