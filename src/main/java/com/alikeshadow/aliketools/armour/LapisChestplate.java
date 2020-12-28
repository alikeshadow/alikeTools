package com.alikeshadow.aliketools.armour;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;

public class LapisChestplate extends ModArmour {
    public LapisChestplate() {
        super(
                ModArmour.lapis,
                EquipmentSlotType.CHEST,
                new Item.Properties()
                        .group(AlikeTools.setup.itemGroup)
                        .maxStackSize(1)
        );
        setRegistryName("lapischestplate");
    }
}
