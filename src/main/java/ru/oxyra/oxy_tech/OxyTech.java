package ru.oxyra.oxy_tech;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(OxyTech.MOD_ID)
public class OxyTech {
    public static final String MOD_ID = "oxy_tech";

    public OxyTech() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
    }

}
