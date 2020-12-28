package com.alikeshadow.aliketools.items;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.entity.EntityType;
import net.minecraft.item.SpawnEggItem;

public class Illusioner_Spawn_Egg extends SpawnEggItem {
    public Illusioner_Spawn_Egg() {
        super(EntityType.ILLUSIONER,1333394, 6908782, (new Properties()).group(AlikeTools.setup.itemGroup));
        setRegistryName("illusioner_spawn_egg");
    }
}
