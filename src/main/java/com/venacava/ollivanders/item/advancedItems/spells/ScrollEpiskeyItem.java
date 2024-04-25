package com.venacava.ollivanders.item.advancedItems.spells;


import net.minecraft.client.item.TooltipType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;

import java.util.List;

public class ScrollEpiskeyItem extends Item {
    public ScrollEpiskeyItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("item.ollivanders.scroll_episkey.tooltip"));
    }
}
