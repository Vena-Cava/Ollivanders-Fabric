package com.venacava.ollivanders.item;

import com.venacava.ollivanders.Ollivanders;
import com.venacava.ollivanders.item.advancedItems.spells.*;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class AllSpellItems {
    public static final Item SCROLL_ACCIO = registerItem("scroll_accio", new ScrollAccioItem(new Item.Settings().maxCount(1)));
    public static final Item SCROLL_AVADA_KEDAVRA = registerItem("scroll_avada_kedavra", new ScrollAvadaKedavraItem(new Item.Settings().maxCount(1)));
    public static final Item SCROLL_EPISKEY = registerItem("scroll_episkey", new ScrollEpiskeyItem(new Item.Settings().maxCount(1)));
    public static final Item SCROLL_EXPECTO_PATRONUM = registerItem("scroll_expecto_patronum", new ScrollExpectoPatronumItem(new Item.Settings().maxCount(1)));
    public static final Item SCROLL_EXPELLIARMUS = registerItem("scroll_expelliarmus", new ScrollExpelliarmusItem(new Item.Settings().maxCount(1)));
    public static final Item SCROLL_IMMOBULUS = registerItem("scroll_immobulus", new ScrollImmobulusItem(new Item.Settings().maxCount(1)));
    public static final Item SCROLL_LUMOS_SOLEM = registerItem("scroll_lumos_solem", new ScrollLumosSolemItem(new Item.Settings().maxCount(1)));
    public static final Item SCROLL_WINGARDIUM_LEVIOSA = registerItem("scroll_wingardium_leviosa", new ScrollWingardiumLeviosaItem(new Item.Settings().maxCount(1)));


    private static void addItemsToSearchTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(SCROLL_ACCIO);
        entries.add(SCROLL_AVADA_KEDAVRA);
        entries.add(SCROLL_EPISKEY);
        entries.add(SCROLL_EXPECTO_PATRONUM);
        entries.add(SCROLL_EXPELLIARMUS);
        entries.add(SCROLL_IMMOBULUS);
        entries.add(SCROLL_LUMOS_SOLEM);
        entries.add(SCROLL_WINGARDIUM_LEVIOSA);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Ollivanders.MOD_ID, name), item);
    }

    // Load this class
    public static void registerSpellItems() {
        Ollivanders.LOGGER.info("Registering Spell Items for " + Ollivanders.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SEARCH).register(AllSpellItems::addItemsToSearchTabItemGroup);
    }

}
