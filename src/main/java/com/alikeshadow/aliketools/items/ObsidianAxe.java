package com.alikeshadow.aliketools.items;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.item.AxeItem;

public class ObsidianAxe extends AxeItem {
    public ObsidianAxe() {
        super(ModItems.obsidian, 5, -3.3f, new Properties().group(AlikeTools.setup.itemGroup));
        setRegistryName("obsidianaxe");
    }
}