package com.alikeshadow.aliketools.entity.horse;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.item.HorseArmorItem;
import net.minecraft.util.ResourceLocation;

public class EmeraldHorseArmour extends HorseArmorItem {
    public EmeraldHorseArmour() {
        super(9,
                new ResourceLocation("aliketools:textures/entity/horse/armor/horse_armor_emerald.png"),
                new Properties()
                        .group(AlikeTools.setup.itemGroup)
                        .maxStackSize(1)
        );
        setRegistryName("emerald_horse_armour");
    }
}