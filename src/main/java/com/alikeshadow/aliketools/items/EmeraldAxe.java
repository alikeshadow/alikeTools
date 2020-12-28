package com.alikeshadow.aliketools.items;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.item.AxeItem;

public class EmeraldAxe extends AxeItem {
    public EmeraldAxe() {
        super(ModItems.emerald, 4, -2f, new Properties().group(AlikeTools.setup.itemGroup));
        setRegistryName("emeraldaxe");
    }
}