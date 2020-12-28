package com.alikeshadow.aliketools.armour;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.inventory.EquipmentSlotType;

public class EmeraldHelmet extends ModArmour {
    public EmeraldHelmet() {
        super(
                ModArmour.emerald,
                EquipmentSlotType.HEAD,
                new Properties()
                    .group(AlikeTools.setup.itemGroup)
                    .maxStackSize(1)
        );
        setRegistryName("emeraldhelmet");
    }
}
