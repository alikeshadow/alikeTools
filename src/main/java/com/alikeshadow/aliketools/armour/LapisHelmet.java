package com.alikeshadow.aliketools.armour;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.inventory.EquipmentSlotType;

public class LapisHelmet extends ModArmour {
    public LapisHelmet() {
        super(
                ModArmour.lapis,
                EquipmentSlotType.HEAD,
                new Properties()
                    .group(AlikeTools.setup.itemGroup)
                    .maxStackSize(1)
        );
        setRegistryName("lapishelmet");
    }
}
