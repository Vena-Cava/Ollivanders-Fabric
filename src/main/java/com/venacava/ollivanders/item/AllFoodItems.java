package com.venacava.ollivanders.item;

import com.venacava.ollivanders.Ollivanders;
import com.venacava.ollivanders.item.advancedItems.advancedFood.ButterbeerItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class AllFoodItems {
    public static final Item BUTTERBEER = registerItem("butterbeer", new ButterbeerItem(new Item.Settings().food(CustomFoodComponents.BUTTERBEER)));
    public static final Item CHOCOLATE_FROG = registerItem("chocolate_frog", new Item(new Item.Settings().food(CustomFoodComponents.CHOCOLATE_FROG)));

    private static void addItemsToFoodTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(BUTTERBEER);
        entries.add(CHOCOLATE_FROG);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Ollivanders.MOD_ID, name), item);
    }


    // Load this class
    public static void registerAllFoodItems() {
        Ollivanders.LOGGER.info("Registering Food Items for " + Ollivanders.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(AllFoodItems::addItemsToFoodTabItemGroup);
    }
}
