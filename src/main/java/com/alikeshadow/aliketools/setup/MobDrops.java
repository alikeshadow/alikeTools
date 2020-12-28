package com.alikeshadow.aliketools.setup;

import com.alikeshadow.aliketools.items.ModItems;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.monster.ZombiePigmanEntity;
import net.minecraft.entity.passive.SquidEntity;
import net.minecraft.entity.passive.horse.HorseEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class MobDrops {
    @SubscribeEvent
    public void onMobDrops(LivingDropsEvent event) {

        if (event.getEntity() instanceof SquidEntity && Config.CALAMARI_DROP.get()) {
            //event.getDrops().clear(); if u want to make it drop nothing
            ItemStack stack = new ItemStack(ModItems.CALAMARI, (int)(Math.random() * 4 + 1));
            ItemEntity drop = new ItemEntity(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
            event.getDrops().add(drop);
        }
        if (event.getEntity() instanceof HorseEntity && Config.RAW_HORSE_DROP.get()) {
            ItemStack stack = new ItemStack(ModItems.RAW_HORSE, (int)(Math.random() * 3 + 1));
            ItemEntity drop = new ItemEntity(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
            event.getDrops().add(drop);
        }
        if (event.getEntity() instanceof ZombiePigmanEntity && Config.ZPIGMEN_DROP_PORKCHOPS.get()) {
            ItemStack stack = new ItemStack(Items.PORKCHOP, (int)(Math.random() * 4 + 1));
            ItemEntity drop = new ItemEntity(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
            event.getDrops().add(drop);
        }



    }
}
