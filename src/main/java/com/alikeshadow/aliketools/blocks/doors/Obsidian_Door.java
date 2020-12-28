package com.alikeshadow.aliketools.blocks.doors;

import net.minecraft.block.DoorBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class Obsidian_Door extends DoorBlock {

    public Obsidian_Door() {
        super(Properties.create(Material.IRON, MaterialColor.BLACK)
                .sound(SoundType.STONE)
                .hardnessAndResistance(50.0F, 1200.0F)
        );
        setRegistryName("obsidian_door");
    }

}