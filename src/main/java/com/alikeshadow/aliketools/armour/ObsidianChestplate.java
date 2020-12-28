package com.alikeshadow.aliketools.armour;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.inventory.EquipmentSlotType;

public class ObsidianChestplate extends ModArmour {
    public ObsidianChestplate() {
        super(
                ModArmour.obsidian,
                EquipmentSlotType.CHEST,
                new Properties()
                        .group(AlikeTools.setup.itemGroup)
                        .maxStackSize(1)
        );
        setRegistryName("obsidianchestplate");
    }
}
