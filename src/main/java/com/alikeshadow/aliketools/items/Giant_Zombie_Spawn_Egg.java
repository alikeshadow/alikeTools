package com.alikeshadow.aliketools.items;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.entity.EntityType;
import net.minecraft.item.SpawnEggItem;

public class Giant_Zombie_Spawn_Egg extends SpawnEggItem {
    public Giant_Zombie_Spawn_Egg() {
        super(EntityType.GIANT,5270849, 3353464, (new Properties()).group(AlikeTools.setup.itemGroup));
        setRegistryName("giant_zombie_spawn_egg");
    }
}
