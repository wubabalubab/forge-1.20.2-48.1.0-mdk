package com.mineboson.minebosonmod.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class ObsidianIngotProperties extends Item.Properties {
    public ObsidianIngotProperties() {
        this.food(new FoodProperties.Builder().alwaysEat().nutrition(1).saturationMod(2f).build());
    }
}
