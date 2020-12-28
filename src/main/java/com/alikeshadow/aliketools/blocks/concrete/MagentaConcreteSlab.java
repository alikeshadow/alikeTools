package com.alikeshadow.aliketools.blocks.concrete;

import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.DyeColor;

public class MagentaConcreteSlab extends SlabBlock {
    public MagentaConcreteSlab() {
        super(Properties.create(Material.ROCK, DyeColor.MAGENTA)
                .sound(SoundType.STONE)
                .hardnessAndResistance(1.8F)
        );
        setRegistryName("magenta_concrete_slab");
    }
}