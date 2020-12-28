package com.alikeshadow.aliketools.armour;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.inventory.EquipmentSlotType;

public class ObsidianBoots extends ModArmour {
    public ObsidianBoots() {
        super(
                ModArmour.obsidian,
                EquipmentSlotType.FEET,
                new Properties()
                        .group(AlikeTools.setup.itemGroup)
                        .maxStackSize(1)
        );
        setRegistryName("obsidianboots");
    }
}
