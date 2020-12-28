package com.alikeshadow.aliketools.items.food;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.item.Item;

public class DarkChocolate extends Item{
    public DarkChocolate() {
        super(
                new Properties()
                        .group(AlikeTools.setup.itemGroup)
                        .food(ModFood.CHOCOLATE)
        );
        setRegistryName("dark_chocolate");
    }
}
