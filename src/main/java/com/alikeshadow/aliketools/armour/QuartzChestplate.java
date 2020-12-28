package com.alikeshadow.aliketools.armour;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.inventory.EquipmentSlotType;

public class QuartzChestplate extends ModArmour {
    public QuartzChestplate() {
        super(
                ModArmour.quartz,
                EquipmentSlotType.CHEST,
                new Properties()
                        .group(AlikeTools.setup.itemGroup)
                        .maxStackSize(1)
        );
        setRegistryName("quartzchestplate");
    }
}
