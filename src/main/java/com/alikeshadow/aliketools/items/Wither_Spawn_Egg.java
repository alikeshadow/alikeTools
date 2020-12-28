package com.alikeshadow.aliketools.items;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.entity.EntityType;
import net.minecraft.item.SpawnEggItem;

public class Wither_Spawn_Egg extends SpawnEggItem {
    public Wither_Spawn_Egg() {
        super(EntityType.WITHER,4868168, 14405326, (new Properties()).group(AlikeTools.setup.itemGroup));
        setRegistryName("wither_spawn_egg");
    }
}
