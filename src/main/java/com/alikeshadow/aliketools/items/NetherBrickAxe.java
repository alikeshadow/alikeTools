package com.alikeshadow.aliketools.items;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.item.AxeItem;

public class NetherBrickAxe extends AxeItem {
    public NetherBrickAxe() {
        super(ModItems.netherbrick, 7.0f, -3.2f, new Properties().group(AlikeTools.setup.itemGroup));
        setRegistryName("netherbrickaxe");
    }
}