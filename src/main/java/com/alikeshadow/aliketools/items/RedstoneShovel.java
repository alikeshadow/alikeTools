package com.alikeshadow.aliketools.items;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.item.ShovelItem;

public class RedstoneShovel extends ShovelItem {
    public RedstoneShovel() {
        super(ModItems.redstone, -0.5f, -1.5f, new Properties().group(AlikeTools.setup.itemGroup));
        setRegistryName("redstoneshovel");
    }
}