package com.venacava.ollivanders.item;


import com.venacava.ollivanders.Ollivanders;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class AllItems {
    public static final Item DRAGON_HEART = registerItem("dragon_heart", new Item(new Item.Settings()));
    public static final Item DRAGON_HEARTSTRING = registerItem("dragon_heartstring", new Item(new Item.Settings()));
    public static final Item GRANIAN_HAIR = registerItem("granian_hair", new Item(new Item.Settings()));
    public static final Item PHOENIX_FEATHER = registerItem("phoenix_feather", new Item(new Item.Settings()));
    public static final Item SNIDGET_FEATHER = registerItem("snidget_feather", new Item(new Item.Settings()));
    public static final Item THUNDERBIRD_FEATHER = registerItem("thunderbird_feather", new Item(new Item.Settings()));
    public static final Item UNICORN_HAIR = registerItem("unicorn_hair", new Item(new Item.Settings()));
    public static final Item ZOUWU_WHISKER = registerItem("zouwu_whisker", new Item(new Item.Settings()));

    private static void addItemsToSearchTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(DRAGON_HEART);
        entries.add(DRAGON_HEARTSTRING);
        entries.add(GRANIAN_HAIR);
        entries.add(PHOENIX_FEATHER);
        entries.add(SNIDGET_FEATHER);
        entries.add(THUNDERBIRD_FEATHER);
        entries.add(UNICORN_HAIR);
        entries.add(ZOUWU_WHISKER);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Ollivanders.MOD_ID, name), item);
    }


    // Load this class
    public static void registerAllItems() {
        Ollivanders.LOGGER.info("Registering Basic Items for " + Ollivanders.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(AllItems::addItemsToSearchTabItemGroup);
    }
}
