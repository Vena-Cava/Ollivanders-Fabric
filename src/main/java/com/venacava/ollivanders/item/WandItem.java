package com.venacava.ollivanders.item;

import com.venacava.ollivanders.Ollivanders;
import com.venacava.ollivanders.item.advancedItems.AdvancedWandItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class WandItem {
    public static final Item WAND = registerItem("wand", new AdvancedWandItem(new Item.Settings().maxCount(1)));

    private static void addItemsToToolsTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(WAND);
    }
    private static void addItemsToSearchTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(WAND);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Ollivanders.MOD_ID, name), item);
    }

    // Load this class
    public static void registerWandItem() {
        Ollivanders.LOGGER.info("Registering Wand Item for " + Ollivanders.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(WandItem::addItemsToToolsTabItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SEARCH).register(WandItem::addItemsToSearchTabItemGroup);
    }
}
