package com.alikeshadow.aliketools.items.food;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.item.Item;

public class HorseCooked extends Item {
    public HorseCooked() {
        super(
                new Properties()
                        .group(AlikeTools.setup.itemGroup)
                        .food(ModFood.COOKED_HORSE)
        );
        setRegistryName("cooked_horse");
    }
}
