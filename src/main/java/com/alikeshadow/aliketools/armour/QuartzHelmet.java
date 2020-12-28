package com.alikeshadow.aliketools.armour;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.inventory.EquipmentSlotType;

public class QuartzHelmet extends ModArmour {
    public QuartzHelmet() {
        super(
                ModArmour.quartz,
                EquipmentSlotType.HEAD,
                new Properties()
                    .group(AlikeTools.setup.itemGroup)
                    .maxStackSize(1)
        );
        setRegistryName("quartzhelmet");
    }
}
