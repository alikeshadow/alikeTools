package com.alikeshadow.aliketools.armour;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.inventory.EquipmentSlotType;

public class RedstoneBoots extends ModArmour {
    public RedstoneBoots() {
        super(
                ModArmour.redstone,
                EquipmentSlotType.FEET,
                new Properties()
                        .group(AlikeTools.setup.itemGroup)
                        .maxStackSize(1)
        );
        setRegistryName("redstoneboots");
    }
}
