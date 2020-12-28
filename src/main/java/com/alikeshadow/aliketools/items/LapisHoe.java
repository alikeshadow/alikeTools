package com.alikeshadow.aliketools.items;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.item.HoeItem;

public class LapisHoe extends HoeItem {
    public LapisHoe() {
        super(ModItems.lapis, -1f, new Properties().group(AlikeTools.setup.itemGroup));
        setRegistryName("lapishoe");
    }
}