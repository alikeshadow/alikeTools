package com.alikeshadow.aliketools.items;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.item.SwordItem;

public class RedstoneSword extends SwordItem {
    public RedstoneSword() {
        super(ModItems.redstone, 2, -1.0f, new Properties().group(AlikeTools.setup.itemGroup));
        setRegistryName("redstonesword");
    }
}