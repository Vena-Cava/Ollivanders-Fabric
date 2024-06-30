package com.venacava.ollivanders.item;

import net.minecraft.component.type.FoodComponent;

public class CustomFoodComponents {
    public static final FoodComponent BUTTERBEER = new FoodComponent.Builder().nutrition(6).saturationModifier(0.25f).build();
    public static final FoodComponent CHOCOLATE_FROG = new FoodComponent.Builder().nutrition(2).saturationModifier(0.25f).build();

}
