package com.alikeshadow.aliketools.items;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.item.HoeItem;

public class ObsidianHoe extends HoeItem {
    public ObsidianHoe() {
        super(ModItems.obsidian, -1,-2.0f, new Properties().group(AlikeTools.setup.itemGroup));
        setRegistryName("obsidianhoe");
    }
}