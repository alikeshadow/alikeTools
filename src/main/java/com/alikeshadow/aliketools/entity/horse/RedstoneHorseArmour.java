package com.alikeshadow.aliketools.entity.horse;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.item.HorseArmorItem;
import net.minecraft.util.ResourceLocation;

public class RedstoneHorseArmour extends HorseArmorItem {
    public RedstoneHorseArmour() {
        super(3,
                new ResourceLocation("aliketools:textures/entity/horse/armor/horse_armor_redstone.png"),
                new Properties()
                        .group(AlikeTools.setup.itemGroup)
                        .maxStackSize(1)
        );
        setRegistryName("redstone_horse_armour");
    }
}
