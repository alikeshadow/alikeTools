package com.alikeshadow.aliketools.items;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.entity.EntityType;
import net.minecraft.item.SpawnEggItem;

public class Ender_Dragon_Spawn_Egg extends SpawnEggItem {
    public Ender_Dragon_Spawn_Egg() {
        super(EntityType.ENDER_DRAGON,1447446, 13008094, (new Properties()).group(AlikeTools.setup.itemGroup));
        setRegistryName("ender_dragon_spawn_egg");
    }
}
