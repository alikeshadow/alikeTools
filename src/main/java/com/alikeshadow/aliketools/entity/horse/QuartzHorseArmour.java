package com.alikeshadow.aliketools.entity.horse;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.item.HorseArmorItem;
import net.minecraft.util.ResourceLocation;

public class QuartzHorseArmour extends HorseArmorItem {
    public QuartzHorseArmour() {
        super(8,
                new ResourceLocation("aliketools:textures/entity/horse/armor/horse_armor_quartz.png"),
                new Properties()
                        .group(AlikeTools.setup.itemGroup)
                        .maxStackSize(1)
        );
        setRegistryName("quartz_horse_armour");
    }
}
