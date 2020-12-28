package com.alikeshadow.aliketools.items;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.item.SwordItem;

public class LapisSword extends SwordItem {
    public LapisSword() {
        super(ModItems.lapis, 3, -2.2f, new Properties().group(AlikeTools.setup.itemGroup));
        setRegistryName("lapissword");
    }
}