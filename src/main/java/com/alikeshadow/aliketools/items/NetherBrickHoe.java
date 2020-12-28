package com.alikeshadow.aliketools.items;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.item.HoeItem;

public class NetherBrickHoe extends HoeItem {
    public NetherBrickHoe() {
        super(ModItems.netherbrick, -2,-2.0f, new Properties().group(AlikeTools.setup.itemGroup));
        setRegistryName("netherbrickhoe");
    }
}
