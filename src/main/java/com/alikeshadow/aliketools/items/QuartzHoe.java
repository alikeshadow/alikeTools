package com.alikeshadow.aliketools.items;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.item.HoeItem;

public class QuartzHoe extends HoeItem {
    public QuartzHoe() {
        super(ModItems.quartz, -2, -1f, new Properties().group(AlikeTools.setup.itemGroup));
        setRegistryName("quartzhoe");
    }
}