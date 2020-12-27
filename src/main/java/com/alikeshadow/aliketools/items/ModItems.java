package com.alikeshadow.aliketools.items;

import com.alikeshadow.aliketools.items.food.Calamari;
import com.alikeshadow.aliketools.items.food.HorseRaw;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.registries.ObjectHolder;

public class ModItems {
   @ObjectHolder("aliketools:emeraldpickaxe")
   public static EmeraldPickaxe EMERALDPICKAXE;
   @ObjectHolder("aliketools:calamari")
   public static Calamari CALAMARI;
   @ObjectHolder("aliketools:raw_horse")
   public static HorseRaw RAW_HORSE;

    @ObjectHolder("aliketools:chainmailsheet")
    public static ChainmailSheet CHAINMAIL_SHEET;

    public static final IItemTier emerald = new ToolMaterial(
            3,
            1250,
            13f,
            3.0f,
            9,
            Ingredient.fromItems(Items.EMERALD)
    );
    public static  final IItemTier obsidian = new ToolMaterial(
            3,
            2250,
            6.0f,
            4.0f,
            14,
            Ingredient.fromItems(Items.OBSIDIAN)
    );
    public static  final IItemTier lapis = new ToolMaterial(
            2,
            1000,
            7.0f,
            2.0f,
            30,
            Ingredient.fromItems(Items.LAPIS_LAZULI)
    );
    public static  final IItemTier redstone = new ToolMaterial(
            2,
            700,
            15.0f,
            1.5f,
            20,
            Ingredient.fromItems(Items.REDSTONE)
    );
    public static  final IItemTier quartz = new ToolMaterial(
            2,
            1400,
            7.5f,
            2.0f,
            10,
            Ingredient.fromItems(Items.QUARTZ)
    );
    public static  final IItemTier netherbrick = new ToolMaterial(
            1,
            131,
            4.0f,
            1.0f,
            5,
            Ingredient.fromItems(Items.NETHER_BRICK)
    );
}
