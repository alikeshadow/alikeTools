package com.alikeshadow.aliketools.armour;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.inventory.EquipmentSlotType;

public class QuartzLeggings extends ModArmour {
    public QuartzLeggings() {
        super(
                ModArmour.quartz,
                EquipmentSlotType.LEGS,
                new Properties()
                        .group(AlikeTools.setup.itemGroup)
                        .maxStackSize(1)
        );
        setRegistryName("quartzleggings");
    }
}
