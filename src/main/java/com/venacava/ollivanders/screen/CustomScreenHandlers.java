package com.venacava.ollivanders.screen;

import com.venacava.ollivanders.Ollivanders;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class CustomScreenHandlers {


        public static void registerScreenHandlers() {
            Ollivanders.LOGGER.info("Registering Screen Handlers for " + Ollivanders.MOD_ID);
        }
}
