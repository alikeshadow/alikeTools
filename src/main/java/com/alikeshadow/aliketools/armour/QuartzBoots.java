package com.alikeshadow.aliketools.armour;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.inventory.EquipmentSlotType;

public class QuartzBoots extends ModArmour {
    public QuartzBoots() {
        super(
                ModArmour.quartz,
                EquipmentSlotType.FEET,
                new Properties()
                        .group(AlikeTools.setup.itemGroup)
                        .maxStackSize(1)
        );
        setRegistryName("quartzboots");
    }
}
