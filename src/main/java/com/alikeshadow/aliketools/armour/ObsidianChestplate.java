package com.alikeshadow.aliketools.armour;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;

public class ObsidianChestplate extends ModArmour {
    public ObsidianChestplate() {
        super(
                ModArmour.obsidian,
                EquipmentSlotType.CHEST,
                new Item.Properties()
                        .group(AlikeTools.setup.itemGroup)
                        .maxStackSize(1)
        );
        setRegistryName("obsidianchestplate");
    }
}
