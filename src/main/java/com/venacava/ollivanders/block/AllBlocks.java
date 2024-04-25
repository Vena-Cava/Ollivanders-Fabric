package com.venacava.ollivanders.block;

import com.venacava.ollivanders.Ollivanders;
import com.venacava.ollivanders.block.workstations.WandStationBlock;
import com.venacava.ollivanders.item.WandItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class AllBlocks {
    public static final Block WAND_STATION = registerBlock("wand_station",
            new WandStationBlock(Block.Settings.copy(Blocks.CRAFTING_TABLE).sounds(BlockSoundGroup.WOOD)));

    private static void addBlocksToFunctionalTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(WAND_STATION);
    }
    private static void addBlocksToSearchTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(WAND_STATION);
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Ollivanders.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Ollivanders.MOD_ID, name),
                new BlockItem(block, new BlockItem.Settings()));
    }

    public static void registerAllBlocks() {
        Ollivanders.LOGGER.info("Registering All Blocks for " + Ollivanders.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(AllBlocks::addBlocksToFunctionalTabItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SEARCH).register(AllBlocks::addBlocksToSearchTabItemGroup);
    }
}
