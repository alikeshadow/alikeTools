package com.alikeshadow.aliketools.armour;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.inventory.EquipmentSlotType;

public class RedstoneChestplate extends ModArmour {
    public RedstoneChestplate() {
        super(
                ModArmour.redstone,
                EquipmentSlotType.CHEST,
                new Properties()
                        .group(AlikeTools.setup.itemGroup)
                        .maxStackSize(1)
        );
        setRegistryName("redstonechestplate");
    }
}
