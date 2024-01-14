package com.mineboson.minebosonmod.modBus;

import com.mineboson.minebosonmod.utls.BosonUtil;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(BosonUtil.MOD_ID)
public class MainMobBus {

    public MainMobBus() {

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemRegistry.ITEMS.register(modEventBus);


    }


}
