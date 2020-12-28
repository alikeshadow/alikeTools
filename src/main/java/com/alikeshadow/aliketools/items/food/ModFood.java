package com.alikeshadow.aliketools.items.food;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class ModFood {
    public static final Food CALAMARI = (new Food.Builder())
            .hunger(2)
            .saturation(0.1F)
            .effect(new EffectInstance(Effects.POISON, 100, 0), 0.6F)
            .build();

    public static final Food COOKED_CALAMARI = (new Food.Builder())
            .hunger(6)
            .saturation(0.6F)
            .build();

    public static final Food RAW_HORSE = (new Food.Builder())
            .hunger(3)
            .saturation(0.3F)
            .meat()
            .build();

    public static final Food COOKED_HORSE = (new Food.Builder())
            .hunger(7)
            .saturation(0.7F)
            .meat()
            .build();
    public static final Food CHOCOLATE = (new Food.Builder())
            .hunger(4)
            .saturation(0.3F)
            .build();
}
