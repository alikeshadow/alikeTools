package com.alikeshadow.aliketools.setup;

import com.alikeshadow.aliketools.items.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModSetup {
    public ItemGroup itemGroup = new ItemGroup("aliketools") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.EMERALDPICKAXE);
        } //tab icon
    };

    public void init() {
    }
}
