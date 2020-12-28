package com.alikeshadow.aliketools.armour;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.inventory.EquipmentSlotType;

public class ObsidianHelmet extends ModArmour {
    public ObsidianHelmet() {
        super(
                ModArmour.obsidian,
                EquipmentSlotType.HEAD,
                new Properties()
                    .group(AlikeTools.setup.itemGroup)
                    .maxStackSize(1)
        );
        setRegistryName("obsidianhelmet");
    }
}
