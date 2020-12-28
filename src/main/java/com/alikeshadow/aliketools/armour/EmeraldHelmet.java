package com.alikeshadow.aliketools.armour;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;

public class EmeraldHelmet extends ModArmour {
    public EmeraldHelmet() {
        super(
                ModArmour.emerald,
                EquipmentSlotType.HEAD,
                new Item.Properties()
                    .group(AlikeTools.setup.itemGroup)
                    .maxStackSize(1)
        );
        setRegistryName("emeraldhelmet");
    }
}
