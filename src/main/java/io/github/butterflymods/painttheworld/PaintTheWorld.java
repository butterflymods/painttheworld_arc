package io.github.butterflymods.painttheworld;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(PaintTheWorld.MOD_ID)
public class PaintTheWorld {
    public static PaintTheWorld instance;
    public static final String MOD_ID = "paint-the-world";
    public static final String MOD_NAME = "Paint the World";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public PaintTheWorld() {
        instance = this;

        FMLJavaModLoadingContext.get().getModEventBus().addListener(instance::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(instance::clientRegistries);

        MinecraftForge.EVENT_BUS.register(instance);
    }

    private void setup(final FMLCommonSetupEvent event) {
//        LOGGER.info("Setup method registered");
    }

    private void clientRegistries(final FMLClientSetupEvent event) {
//        LOGGER.info("Client method registered");
    }
}
