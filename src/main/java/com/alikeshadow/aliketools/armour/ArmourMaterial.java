package com.alikeshadow.aliketools.armour;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ArmourMaterial implements IArmorMaterial{
    private String name;
    private int maxDamageFactor;
    private int[] damageReductionAmountArray;
    private int enchantability;
    private SoundEvent soundEvent;
    private float toughness;
    private Ingredient repair;

    ArmourMaterial(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantability, SoundEvent soundEvent, float toughness, Ingredient repair) {
        this.name = name;
        this.maxDamageFactor = maxDamageFactor;
        this.damageReductionAmountArray = damageReductionAmountArray;
        this.enchantability = enchantability;
        this.soundEvent = soundEvent;
        this.toughness = toughness;
        this.repair = repair;
    }

    @Override
    public int getDurability(EquipmentSlotType slotIn) { return damageReductionAmountArray[slotIn.getIndex()]*maxDamageFactor; }
    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) { return damageReductionAmountArray[slotIn.getIndex()]; }
    @Override
    public int getEnchantability() { return enchantability; }
    @Override
    public SoundEvent getSoundEvent() { return soundEvent; }
    @Override
    public Ingredient getRepairMaterial() { return this.repair; }
    @OnlyIn(Dist.CLIENT)
    public String getName() { return name; }
    public float getToughness() { return toughness; }
}
