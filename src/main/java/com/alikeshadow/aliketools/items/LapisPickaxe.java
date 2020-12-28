package com.alikeshadow.aliketools.items;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.item.PickaxeItem;

public class LapisPickaxe extends PickaxeItem {
    public LapisPickaxe() {
        super(ModItems.lapis, 1, -2.6f, new Properties().group(AlikeTools.setup.itemGroup));
        setRegistryName("lapispickaxe");
    }
}