package com.alikeshadow.aliketools.items.food;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.item.Item;

public class MilkChocolate extends Item{
    public MilkChocolate() {
        super(
                new Properties()
                        .group(AlikeTools.setup.itemGroup)
                        .food(ModFood.CHOCOLATE)
        );
        setRegistryName("milk_chocolate");
    }
}
