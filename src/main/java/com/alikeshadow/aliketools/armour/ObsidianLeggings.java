package com.alikeshadow.aliketools.armour;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.inventory.EquipmentSlotType;

public class ObsidianLeggings extends ModArmour {
    public ObsidianLeggings() {
        super(
                ModArmour.obsidian,
                EquipmentSlotType.LEGS,
                new Properties()
                        .group(AlikeTools.setup.itemGroup)
                        .maxStackSize(1)
        );
        setRegistryName("obsidianleggings");
    }
}
