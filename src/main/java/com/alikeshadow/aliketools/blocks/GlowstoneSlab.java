package com.alikeshadow.aliketools.blocks;

import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class GlowstoneSlab extends SlabBlock {
    public GlowstoneSlab() {
        super(Properties.create(Material.GLASS)
                .sound(SoundType.GLASS)
                .hardnessAndResistance(0.3F)
                .lightValue(15)
        );
        setRegistryName("glowstoneslab");
    }
}