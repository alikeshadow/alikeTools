package com.alikeshadow.aliketools.items;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.item.SwordItem;

public class NetherBrickSword extends SwordItem {
    public NetherBrickSword() {
        super(ModItems.netherbrick, 3, -2.4f, new Properties().group(AlikeTools.setup.itemGroup));
        setRegistryName("netherbricksword");
    }
}