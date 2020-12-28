package com.alikeshadow.aliketools.entity.horse;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.item.HorseArmorItem;
import net.minecraft.util.ResourceLocation;

public class ObsidianHorseArmour extends HorseArmorItem {
    public ObsidianHorseArmour() {
        super(15,
                new ResourceLocation("aliketools:textures/entity/horse/armor/horse_armor_obsidian.png"),
                new Properties()
                        .group(AlikeTools.setup.itemGroup)
                        .maxStackSize(1)
        );
        setRegistryName("obsidian_horse_armour");
    }
}