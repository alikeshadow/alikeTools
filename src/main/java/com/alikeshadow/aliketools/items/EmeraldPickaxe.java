package com.alikeshadow.aliketools.items;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.item.PickaxeItem;

public class EmeraldPickaxe extends PickaxeItem {
    public EmeraldPickaxe() {
        super(ModItems.emerald, 0, -2f, new Properties().group(AlikeTools.setup.itemGroup));
        setRegistryName("emeraldpickaxe");
    }
}