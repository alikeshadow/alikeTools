package com.alikeshadow.aliketools.items;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.item.ShovelItem;

public class NetherBrickShovel extends ShovelItem {
    public NetherBrickShovel() {
        super(ModItems.netherbrick, 1.5f, -3.0f, new Properties().group(AlikeTools.setup.itemGroup));
        setRegistryName("netherbrickshovel");
    }
}
