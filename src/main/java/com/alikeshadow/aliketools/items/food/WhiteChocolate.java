package com.alikeshadow.aliketools.items.food;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.item.Item;

public class WhiteChocolate extends Item {
    public WhiteChocolate() {
        super(
                new Properties()
                        .group(AlikeTools.setup.itemGroup)
                        .food(ModFood.CHOCOLATE)
        );
        setRegistryName("white_chocolate");
    }
}
