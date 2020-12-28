package com.alikeshadow.aliketools.armour;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.inventory.EquipmentSlotType;

public class RedstoneHelmet extends ModArmour {
    public RedstoneHelmet() {
        super(
                ModArmour.redstone,
                EquipmentSlotType.HEAD,
                new Properties()
                    .group(AlikeTools.setup.itemGroup)
                    .maxStackSize(1)
        );
        setRegistryName("redstonehelmet");
    }
}
