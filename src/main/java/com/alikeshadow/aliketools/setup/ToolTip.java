package com.alikeshadow.aliketools.setup;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.resources.I18n;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.EnchantedBookItem;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.ListNBT;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;
import java.util.List;
import java.util.Optional;

public class ToolTip {

    @SubscribeEvent
    public void onToolTip(ItemTooltipEvent event) {
        ListNBT list = EnchantedBookItem.getEnchantments(event.getItemStack());
        if (list.isEmpty()) {
            list = event.getItemStack().getEnchantmentTagList();
        }

        if (list.size() > 0) {
            if (Screen.hasShiftDown()) {
                list.stream().map(nbt -> (CompoundNBT) nbt).forEach(tag -> {
                    ResourceLocation location = new ResourceLocation(tag.getString("id"));
                    int level = tag.getInt("lvl");
                    Enchantment enchantment = ForgeRegistries.ENCHANTMENTS.getValue(location);
                    if (enchantment != null) {
                        String key = String.format("enchantment.%s.%s.info", location.getNamespace(), location.getPath());
                        if (I18n.hasKey(key)) {
                            ITextComponent displayName = enchantment.getDisplayName(level);
                            Optional<ITextComponent> optional = event.getToolTip().stream().filter((component) -> component.getString().equals(displayName.getString())).findFirst();
                            if (optional.isPresent()) {
                                int index = event.getToolTip().indexOf(optional.get());
                                List<String> lines = Minecraft.getInstance().fontRenderer.listFormattedStringToWidth("- " + I18n.format(key), 150);
                                for (int i = lines.size() - 1; i >= 0; --i) {
                                    event.getToolTip().add(index + 1, (new StringTextComponent(lines.get(i))).setStyle((new Style()).setColor(TextFormatting.BLUE)));
                                }
                            }
                        }
                    }
                });
            } else {
                Style style = new Style().setColor(TextFormatting.GOLD);
                event.getToolTip().add((new StringTextComponent(I18n.format("aliketools.enchanthelp"))).setStyle(style));
            }
        }
    }

}