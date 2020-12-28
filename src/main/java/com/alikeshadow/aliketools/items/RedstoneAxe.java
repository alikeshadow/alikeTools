package com.alikeshadow.aliketools.items;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.item.AxeItem;

public class RedstoneAxe extends AxeItem {
    public RedstoneAxe() {
        super(ModItems.redstone, 1.5f, -1.3f, new Properties().group(AlikeTools.setup.itemGroup));
        setRegistryName("redstoneaxe");
    }
}