package com.alikeshadow.aliketools.items;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.item.AxeItem;

public class QuartzAxe extends AxeItem {
    public QuartzAxe() {
        super(ModItems.quartz, 4, -2.5f, new Properties().group(AlikeTools.setup.itemGroup));
        setRegistryName("quartzaxe");
    }
}