package com.alikeshadow.aliketools.items;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.item.ShovelItem;

public class LapisShovel extends ShovelItem {
    public LapisShovel() {
        super(ModItems.lapis, 0.5f, -2.6f, new Properties().group(AlikeTools.setup.itemGroup));
        setRegistryName("lapisshovel");
    }
}