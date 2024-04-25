package com.venacava.ollivanders.item;

import com.venacava.ollivanders.Ollivanders;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static com.venacava.ollivanders.item.AllSpellItems.*;
import static com.venacava.ollivanders.item.AllItems.*;

public class AllItemGroups {

    private static final ItemGroup MAGICAL_INGREDIENTS_GROUP =
            Registry.register(Registries.ITEM_GROUP, new Identifier("ollivanders", "magical_ingredients_group"),
                    FabricItemGroup.builder()
                            .icon(() -> new ItemStack(PHOENIX_FEATHER))
                            .displayName(Text.translatable("itemGroup.ollivanders.magical_ingredients_group"))
                            .entries((context, entries) -> {
                                entries.add(DRAGON_HEART);
                                entries.add(DRAGON_HEARTSTRING);
                                entries.add(GRANIAN_HAIR);
                                entries.add(PHOENIX_FEATHER);
                                entries.add(SNIDGET_FEATHER);
                                entries.add(THUNDERBIRD_FEATHER);
                                entries.add(UNICORN_HAIR);
                                entries.add(ZOUWU_WHISKER);
                            })

                            .build());

    private static final ItemGroup SPELL_SCROLL_GROUP =
            Registry.register(Registries.ITEM_GROUP, new Identifier("ollivanders", "spell_scroll_group"),
                    FabricItemGroup.builder()
                            .icon(() -> new ItemStack(SCROLL_WINGARDIUM_LEVIOSA))
                            .displayName(Text.translatable("itemGroup.ollivanders.spell_scroll_group"))
                            .entries((context, entries) -> {
                                entries.add(SCROLL_ACCIO);
                                entries.add(SCROLL_AVADA_KEDAVRA);
                                entries.add(SCROLL_EPISKEY);
                                entries.add(SCROLL_EXPELLIARMUS);
                                entries.add(SCROLL_EXPECTO_PATRONUM);
                                entries.add(SCROLL_IMMOBULUS);
                                entries.add(SCROLL_LUMOS_SOLEM);
                                entries.add(SCROLL_WINGARDIUM_LEVIOSA);
                            })

                            .build());
    public static void registerItemGroups() {
        Ollivanders.LOGGER.info("Registering Item Groups for " + Ollivanders.MOD_ID);
    }
}
