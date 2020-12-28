package com.alikeshadow.aliketools.items;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.item.HoeItem;

public class EmeraldHoe extends HoeItem {
    public EmeraldHoe() {
        super(ModItems.emerald, 0, -1F ,new Properties().group(AlikeTools.setup.itemGroup));
        setRegistryName("emeraldhoe");
    }
}