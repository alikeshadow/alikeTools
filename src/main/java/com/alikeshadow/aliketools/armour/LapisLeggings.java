package com.alikeshadow.aliketools.armour;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.inventory.EquipmentSlotType;

public class LapisLeggings extends ModArmour {
    public LapisLeggings() {
        super(
                ModArmour.lapis,
                EquipmentSlotType.LEGS,
                new Properties()
                        .group(AlikeTools.setup.itemGroup)
                        .maxStackSize(1)
        );
        setRegistryName("lapisleggings");
    }
}
