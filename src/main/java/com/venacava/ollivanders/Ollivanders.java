package com.venacava.ollivanders;

import net.fabricmc.api.ModInitializer;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Ollivanders implements ModInitializer {
		// an instance of our new item
		public static final Item PHOENIX_FEATHER =
				Registry.register(Registries.ITEM, new Identifier("ollivanders", "phoenix_feather"),
						new Item(new Item.Settings()));
		public static final Item DRAGON_HEART =
			Registry.register(Registries.ITEM, new Identifier("ollivanders", "dragon_heart"),
					new Item(new Item.Settings()));
		public static final Item DRAGON_HEARTSTRING =
			Registry.register(Registries.ITEM, new Identifier("ollivanders", "dragon_heartstring"),
					new Item(new Item.Settings()));
		public static final Item UNICORN_HAIR =
			Registry.register(Registries.ITEM, new Identifier("ollivanders", "unicorn_hair"),
					new Item(new Item.Settings()));
		public static final Item WAND =
			Registry.register(Registries.ITEM, new Identifier("ollivanders", "wand"),
					new Item(new Item.Settings().maxCount(1)));

	public class CustomItem extends Item {

		public CustomItem(Settings settings) {
			super(settings);
		}
	}

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("ollivanders");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");
	}
}