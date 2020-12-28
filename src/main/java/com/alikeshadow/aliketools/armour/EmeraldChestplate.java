package com.alikeshadow.aliketools.armour;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.inventory.EquipmentSlotType;

public class EmeraldChestplate extends ModArmour {
    public EmeraldChestplate() {
        super(
                ModArmour.emerald,
                EquipmentSlotType.CHEST,
                new Properties()
                        .group(AlikeTools.setup.itemGroup)
                        .maxStackSize(1)
        );
        setRegistryName("emeraldchestplate");
    }
}
