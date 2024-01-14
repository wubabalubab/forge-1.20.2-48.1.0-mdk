package com.mineboson.minebosonmod.modBus;

import com.mineboson.minebosonmod.item.ObsidianIngot;
import com.mineboson.minebosonmod.utls.BosonUtil;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BosonUtil.MOD_ID);
    public static final RegistryObject<Item> obsidianIngot = ITEMS.register("obsidian_ingot", new Supplier<Item>() {
        @Override
        public Item get() {
            return new ObsidianIngot();
        }
    });

}
