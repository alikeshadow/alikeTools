package com.alikeshadow.aliketools.armour;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.inventory.EquipmentSlotType;

public class LapisBoots extends ModArmour {
    public LapisBoots() {
        super(
                ModArmour.lapis,
                EquipmentSlotType.FEET,
                new Properties()
                        .group(AlikeTools.setup.itemGroup)
                        .maxStackSize(1)
        );
        setRegistryName("lapisboots");
    }
}
