package com.alikeshadow.aliketools.armour;

import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.merchant.villager.VillagerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.NonNullList;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;
import net.minecraftforge.registries.ObjectHolder;

import java.util.List;

public class ModArmour extends ArmorItem {
  @ObjectHolder("aliketools:obsidianhelmet")
  public static ObsidianHelmet OBSIDIANHELMET;
  @ObjectHolder("aliketools:obsidianchestplate")
  public static ObsidianChestplate OBSIDIANCHESTPLATE;
  @ObjectHolder("aliketools:obsidianleggings")
  public static ObsidianLeggings OBSIDIANLEGGINGS;
  @ObjectHolder("aliketools:obsidianboots")
  public static ObsidianBoots OBSIDIANBOOTS;

  @ObjectHolder("aliketools:emeraldhelmet")
  public static EmeraldHelmet EMERALDHELMET;
  @ObjectHolder("aliketools:emeraldchestplate")
  public static EmeraldChestplate EMERALDCHESTPLATE;
  @ObjectHolder("aliketools:emeraldleggings")
  public static EmeraldLeggings EMERALDLEGGINGS;
  @ObjectHolder("aliketools:emeraldboots")
  public static EmeraldBoots EMERALDBOOTS;

  @ObjectHolder("aliketools:quartzhelmet")
  public static QuartzHelmet QUARTZHELMET;
  @ObjectHolder("aliketools:quartzchestplate")
  public static QuartzChestplate QUARTZCHESTPLATE;
  @ObjectHolder("aliketools:quartzleggings")
  public static QuartzLeggings QUARTZLEGGINGS;
  @ObjectHolder("aliketools:quartzboots")
  public static QuartzBoots QUARTZBOOTS;

  @ObjectHolder("aliketools:redstonehelmet")
  public static RedstoneHelmet REDSTONEHELMET;
  @ObjectHolder("aliketools:redstonechestplate")
  public static RedstoneChestplate REDSTONECHESTPLATE;
  @ObjectHolder("aliketools:redstoneleggings")
  public static RedstoneLeggings REDSTONELEGGINGS;
  @ObjectHolder("aliketools:redstoneboots")
  public static RedstoneBoots REDSTONEBOOTS;

  @ObjectHolder("aliketools:lapishelmet")
  public static LapisHelmet LAPISHELMET;
  @ObjectHolder("aliketools:lapischestplate")
  public static LapisChestplate LAPISCHESTPLATE;
  @ObjectHolder("aliketools:lapisleggings")
  public static LapisLeggings LAPISLEGGINGS;
  @ObjectHolder("aliketools:lapisboots")
  public static LapisBoots LAPISBOOTS;

  public static final IArmorMaterial emerald = new ArmourMaterial(
          "aliketools:emerald",
          90,
          new int[]{3, 4, 7, 2}, //Boot, Leg, Chest, Helm
          9,
          SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
          1.5f,
          Ingredient.fromItems(Items.EMERALD)
  );
  public static final IArmorMaterial obsidian = new ArmourMaterial(
          "aliketools:obsidian",
          150,
          new int[]{3, 6, 8, 3}, //Boot, Leg, Chest, Helm
          9,
          SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
          3.0f,
          Ingredient.fromItems(Items.OBSIDIAN)
  );
  public static final IArmorMaterial lapis = new ArmourMaterial(
          "aliketools:lapis",
          75,
          new int[]{1, 4, 6, 2}, //Boot, Leg, Chest, Helm
          30,
          SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
          0.0f,
          Ingredient.fromItems(Items.LAPIS_LAZULI)
  );
  public static final IArmorMaterial redstone = new ArmourMaterial(
          "aliketools:redstone",
          60,
          new int[]{1, 3, 4, 2}, //Boot, Leg, Chest, Helm
          20,
          SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
          0.0f,
          Ingredient.fromItems(Items.REDSTONE)
  );
  public static final IArmorMaterial quartz = new ArmourMaterial(
          "aliketools:quartz",
          90,
          new int[]{3, 4, 6, 2}, //Boot, Leg, Chest, Helm
          10,
          SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
          0.5f,
          Ingredient.fromItems(Items.QUARTZ)
  );

  public ModArmour(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builder) {
    super(materialIn, slot, builder);
  }
  @Override
  public void onArmorTick(final ItemStack stack, final World world, final PlayerEntity player) {
    NonNullList<ItemStack> armourSlots = player.inventory.armorInventory;
    ItemStack head = armourSlots.get(3);
    ItemStack chest = armourSlots.get(2);
    ItemStack legs = armourSlots.get(1);
    ItemStack boots = armourSlots.get(0);

    if(chest.getItem().equals(ModArmour.OBSIDIANCHESTPLATE) || legs.getItem().equals(ModArmour.OBSIDIANLEGGINGS)){
      player.addPotionEffect(new EffectInstance(Effects.SLOWNESS, 3, 0,false,false));
    }
    if(head.getItem().equals(ModArmour.OBSIDIANHELMET) && chest.getItem().equals(ModArmour.OBSIDIANCHESTPLATE) && legs.getItem().equals(ModArmour.OBSIDIANLEGGINGS) && boots.getItem().equals(ModArmour.OBSIDIANBOOTS)){
      player.addPotionEffect(new EffectInstance(Effects.SLOWNESS, 3, 1,false,false));
      player.getAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(1.0F);
    }
    else {
      player.getAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(0.0F);
    }

    if(head.getItem().equals(ModArmour.EMERALDHELMET) && chest.getItem().equals(ModArmour.EMERALDCHESTPLATE) && legs.getItem().equals(ModArmour.EMERALDLEGGINGS) && boots.getItem().equals(ModArmour.EMERALDBOOTS)) {
      List<Entity> entityList = world.getEntitiesWithinAABBExcludingEntity(player, (player.getBoundingBox().grow(4D)));
      for (Entity current : entityList) {
        if (current instanceof VillagerEntity) {
          VillagerEntity currentVillager = (VillagerEntity) current;
          for (MerchantOffer merchantoffer1 : currentVillager.getOffers()) {
            if (merchantoffer1.func_222212_l() == 0) {
              int j = (int) Math.floor(0.25D * (double) merchantoffer1.func_222218_a().getCount());
              merchantoffer1.func_222207_a(-Math.max(j, 1));
            }
          }
        }
      }
    }
    if(head.getItem().equals(ModArmour.QUARTZHELMET) && chest.getItem().equals(ModArmour.QUARTZCHESTPLATE) && legs.getItem().equals(ModArmour.QUARTZLEGGINGS) && boots.getItem().equals(ModArmour.QUARTZBOOTS)){
      player.addPotionEffect(new EffectInstance(Effects.FIRE_RESISTANCE, 3, 1,false,false));
    }
    if(head.getItem().equals(ModArmour.REDSTONEHELMET) && chest.getItem().equals(ModArmour.REDSTONECHESTPLATE) && legs.getItem().equals(ModArmour.REDSTONELEGGINGS) && boots.getItem().equals(ModArmour.REDSTONEBOOTS)) {
        player.addPotionEffect(new EffectInstance(Effects.HASTE, 3, 0, false, false));
    }
    if(head.getItem().equals(ModArmour.LAPISHELMET) && chest.getItem().equals(ModArmour.LAPISCHESTPLATE) && legs.getItem().equals(ModArmour.LAPISLEGGINGS) && boots.getItem().equals(ModArmour.LAPISBOOTS)) {
      player.addPotionEffect(new EffectInstance(Effects.SPEED, 3, 0, false, false));
    }
  }
}
