package com.alikeshadow.aliketools.items;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.item.ShovelItem;

public class EmeraldShovel extends ShovelItem {
    public EmeraldShovel() {
        super(ModItems.emerald, 0.5f, -2f, new Properties().group(AlikeTools.setup.itemGroup));
        setRegistryName("emeraldshovel");
    }
}