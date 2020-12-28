package com.alikeshadow.aliketools.items;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.item.ShovelItem;

public class QuartzShovel extends ShovelItem {
    public QuartzShovel() {
        super(ModItems.quartz, 1.0f, -2.9f, new Properties().group(AlikeTools.setup.itemGroup));
        setRegistryName("quartzshovel");
    }
}