package com.alikeshadow.aliketools.items;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.item.ShovelItem;

public class ObsidianShovel extends ShovelItem {
    public ObsidianShovel() {
        super(ModItems.obsidian, 1.0f, -3.3f, new Properties().group(AlikeTools.setup.itemGroup));
        setRegistryName("obsidianshovel");
    }
}