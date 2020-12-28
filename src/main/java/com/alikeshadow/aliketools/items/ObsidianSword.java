package com.alikeshadow.aliketools.items;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.item.SwordItem;

public class ObsidianSword extends SwordItem {
    public ObsidianSword() {
        super(ModItems.obsidian, 3, -2.8f, new Properties().group(AlikeTools.setup.itemGroup));
        setRegistryName("obsidiansword");
    }
}