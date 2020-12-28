package com.alikeshadow.aliketools.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class MultiOre extends Block {
    public MultiOre() {
        super(Properties.create(Material.ROCK)
            .sound(SoundType.STONE)
             .hardnessAndResistance(2.0f)
                .harvestLevel(2)
        );
        setRegistryName("multiore");
    }
}
