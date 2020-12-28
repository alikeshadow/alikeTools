package com.alikeshadow.aliketools.items;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.item.PickaxeItem;

public class QuartzPickaxe extends PickaxeItem {
    public QuartzPickaxe() {
        super(ModItems.quartz, 1, -2.8f, new Properties().group(AlikeTools.setup.itemGroup));
        setRegistryName("quartzpickaxe");
    }
}