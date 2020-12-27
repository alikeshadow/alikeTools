package com.alikeshadow.aliketools.items;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.entity.EntityType;
import net.minecraft.item.SpawnEggItem;

public class Iron_Golem_Spawn_Egg extends SpawnEggItem {
    public Iron_Golem_Spawn_Egg() {
        super(EntityType.IRON_GOLEM,9075049, 14934498, (new Properties()).group(AlikeTools.setup.itemGroup));
        setRegistryName("iron_golem_spawn_egg");
    }
}
