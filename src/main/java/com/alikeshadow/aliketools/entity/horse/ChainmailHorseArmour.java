package com.alikeshadow.aliketools.entity.horse;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.item.HorseArmorItem;
import net.minecraft.util.ResourceLocation;

public class ChainmailHorseArmour extends HorseArmorItem {
    public ChainmailHorseArmour() {
        super(4,
                new ResourceLocation("aliketools:textures/entity/horse/armor/horse_armor_chainmail.png"),
                new Properties()
                        .group(AlikeTools.setup.itemGroup)
                        .maxStackSize(1)
        );
        setRegistryName("chainmail_horse_armour");
    }
}
