package com.alikeshadow.aliketools.blocks.concrete;

import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.DyeColor;

public class YellowConcreteSlab extends SlabBlock {
    public YellowConcreteSlab() {
        super(Properties.create(Material.ROCK, DyeColor.YELLOW)
                .sound(SoundType.STONE)
                .hardnessAndResistance(1.8F)
        );
        setRegistryName("yellow_concrete_slab");
    }
}