package com.alikeshadow.aliketools.items.food;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.item.Item;

public class HorseRaw extends Item{
    public HorseRaw() {
        super(
                new Properties()
                        .group(AlikeTools.setup.itemGroup)
                        .food(ModFood.RAW_HORSE)
        );
        setRegistryName("raw_horse");
    }
}
