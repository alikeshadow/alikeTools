package com.alikeshadow.aliketools.armour;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.inventory.EquipmentSlotType;

public class EmeraldBoots extends ModArmour {
    public EmeraldBoots() {
        super(
                ModArmour.emerald,
                EquipmentSlotType.FEET,
                new Properties()
                        .group(AlikeTools.setup.itemGroup)
                        .maxStackSize(1)
        );
        setRegistryName("emeraldboots");
    }
}
