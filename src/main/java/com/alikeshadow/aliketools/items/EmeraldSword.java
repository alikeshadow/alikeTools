package com.alikeshadow.aliketools.items;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.item.SwordItem;

public class EmeraldSword extends SwordItem {
    public EmeraldSword() {
        super(ModItems.emerald, 2, -2f, new Properties().group(AlikeTools.setup.itemGroup));
        setRegistryName("emeraldsword");
    }
}