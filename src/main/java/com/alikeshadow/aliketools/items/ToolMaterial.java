package com.alikeshadow.aliketools.items;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyLoadBase;

import java.util.function.Supplier;

public class ToolMaterial implements IItemTier {
    private int harvestLevel;
    private int maxUses;
    private float efficiency;
    private float attackDamage;
    private int enchantability;
    private LazyLoadBase<Ingredient> repair;

    public ToolMaterial(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> supplier) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repair = new LazyLoadBase(supplier);
    }

    @Override
    public int getMaxUses() {
        return maxUses;
    }
    @Override
    public float getEfficiency() {
        return efficiency;
    }
    @Override
    public float getAttackDamage() {
        return attackDamage;
    }
    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }
    @Override
    public int getEnchantability() {
        return enchantability;
    }
    @Override
    public Ingredient getRepairMaterial() { return this.repair.getValue(); }
}
