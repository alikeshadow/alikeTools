package com.alikeshadow.aliketools.items;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.item.PickaxeItem;

public class NetherBrickPickaxe extends PickaxeItem {
    public NetherBrickPickaxe() {
        super(ModItems.netherbrick, 1, -2.8f, new Properties().group(AlikeTools.setup.itemGroup));
        setRegistryName("netherbrickpickaxe");
    }
}