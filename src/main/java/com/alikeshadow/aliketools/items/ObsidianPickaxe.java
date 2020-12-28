package com.alikeshadow.aliketools.items;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.item.PickaxeItem;

public class ObsidianPickaxe extends PickaxeItem {
    public ObsidianPickaxe() {
        super(ModItems.obsidian, 1, -3.1f, new Properties().group(AlikeTools.setup.itemGroup));
        setRegistryName("obsidianpickaxe");
    }
}