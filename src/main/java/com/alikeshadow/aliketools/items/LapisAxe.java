package com.alikeshadow.aliketools.items;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.item.AxeItem;

public class LapisAxe extends AxeItem {
    public LapisAxe() {
        super(ModItems.lapis, 5, -2.8f, new Properties().group(AlikeTools.setup.itemGroup));
        setRegistryName("lapisaxe");
    }
}