package com.alikeshadow.aliketools.items;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.item.HoeItem;

public class RedstoneHoe extends HoeItem {
    public RedstoneHoe() {
        super(ModItems.redstone, 1.0f, new Properties().group(AlikeTools.setup.itemGroup));
        setRegistryName("redstonehoe");
    }
}