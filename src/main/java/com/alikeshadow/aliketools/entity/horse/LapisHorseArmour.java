package com.alikeshadow.aliketools.entity.horse;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.item.HorseArmorItem;
import net.minecraft.util.ResourceLocation;

public class LapisHorseArmour extends HorseArmorItem {
    public LapisHorseArmour() {
        super(4,
                new ResourceLocation("aliketools:textures/entity/horse/armor/horse_armor_lapis.png"),
                new Properties()
                        .group(AlikeTools.setup.itemGroup)
                        .maxStackSize(1)
        );
        setRegistryName("lapis_horse_armour");
    }
}
