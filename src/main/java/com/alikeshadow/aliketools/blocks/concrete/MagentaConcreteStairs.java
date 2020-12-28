package com.alikeshadow.aliketools.blocks.concrete;

import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.DyeColor;

public class MagentaConcreteStairs extends StairsBlock {
    public MagentaConcreteStairs() {
    super(Blocks.MAGENTA_CONCRETE.getDefaultState(),
                Properties.create(Material.ROCK, DyeColor.MAGENTA)
                        .sound(SoundType.STONE)
                        .hardnessAndResistance(1.8F)
        );
        setRegistryName("magenta_concrete_stairs");
    }
}