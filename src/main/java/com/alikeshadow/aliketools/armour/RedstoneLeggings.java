package com.alikeshadow.aliketools.armour;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.inventory.EquipmentSlotType;

public class RedstoneLeggings extends ModArmour {
    public RedstoneLeggings() {
        super(
                ModArmour.redstone,
                EquipmentSlotType.LEGS,
                new Properties()
                        .group(AlikeTools.setup.itemGroup)
                        .maxStackSize(1)
        );
        setRegistryName("redstoneleggings");
    }
}
