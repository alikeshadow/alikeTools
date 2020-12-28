package com.alikeshadow.aliketools.armour;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;

public class RedstoneBoots extends ModArmour {
    public RedstoneBoots() {
        super(
                ModArmour.redstone,
                EquipmentSlotType.FEET,
                new Item.Properties()
                        .group(AlikeTools.setup.itemGroup)
                        .maxStackSize(1)
        );
        setRegistryName("redstoneboots");
    }
}
