package com.alikeshadow.aliketools.armour;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.inventory.EquipmentSlotType;

public class LapisChestplate extends ModArmour {
    public LapisChestplate() {
        super(
                ModArmour.lapis,
                EquipmentSlotType.CHEST,
                new Properties()
                        .group(AlikeTools.setup.itemGroup)
                        .maxStackSize(1)
        );
        setRegistryName("lapischestplate");
    }
}
