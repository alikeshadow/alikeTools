package com.alikeshadow.aliketools.items.food;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.item.Item;

public class CalamariCooked extends Item {
    public CalamariCooked() {
        super(
                new Properties()
                        .group(AlikeTools.setup.itemGroup)
                        .food(ModFood.COOKED_CALAMARI)
        );
        setRegistryName("cooked_calamari");
    }
}
