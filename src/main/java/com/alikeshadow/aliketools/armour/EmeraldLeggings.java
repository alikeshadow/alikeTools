package com.alikeshadow.aliketools.armour;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.inventory.EquipmentSlotType;

public class EmeraldLeggings extends ModArmour {
    public EmeraldLeggings() {
        super(
                ModArmour.emerald,
                EquipmentSlotType.LEGS,
                new Properties()
                        .group(AlikeTools.setup.itemGroup)
                        .maxStackSize(1)
        );
        setRegistryName("emeraldleggings");
    }
}
