package com.alikeshadow.aliketools.items;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.item.PickaxeItem;

public class RedstonePickaxe extends PickaxeItem {
    public RedstonePickaxe() {
        super(ModItems.redstone, 0, -1.0f, new Properties().group(AlikeTools.setup.itemGroup));
        setRegistryName("redstonepickaxe");
    }
}