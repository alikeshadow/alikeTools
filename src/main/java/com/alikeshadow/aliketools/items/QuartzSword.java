package com.alikeshadow.aliketools.items;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.item.SwordItem;

public class QuartzSword extends SwordItem {
    public QuartzSword() {
        super(ModItems.quartz, 3, -2.3f, new Properties().group(AlikeTools.setup.itemGroup));
        setRegistryName("quartzsword");
    }
}
