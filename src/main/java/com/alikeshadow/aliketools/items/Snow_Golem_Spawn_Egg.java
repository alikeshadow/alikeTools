package com.alikeshadow.aliketools.items;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.entity.EntityType;
import net.minecraft.item.SpawnEggItem;

public class Snow_Golem_Spawn_Egg extends SpawnEggItem {
    public Snow_Golem_Spawn_Egg() {
        super(EntityType.SNOW_GOLEM,16777215, 15439125, (new Properties()).group(AlikeTools.setup.itemGroup));
        setRegistryName("snow_golem_spawn_egg");
    }
}
