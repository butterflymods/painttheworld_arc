package io.github.butterflymods.painttheworld;

import io.github.butterflymods.painttheworld.init.PTWBlocks;
import io.github.butterflymods.painttheworld.init.PTWItems;
import io.github.butterflymods.painttheworld.util.CustomItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(PaintTheWorld.MOD_ID)
public class PaintTheWorld {
    public static PaintTheWorld instance;
    public static final String MOD_ID = "painttheworld";
    public static final ItemGroup ITEM_GROUP = new CustomItemGroup(MOD_ID, PTWItems.PAINTBRUSH);
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public PaintTheWorld() {
        instance = this;

        FMLJavaModLoadingContext.get().getModEventBus().addListener(instance::setup);

        MinecraftForge.EVENT_BUS.register(instance);

        PTWItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        PTWBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static String log(String text) {
        return "[ Paint the World] " + text;
    }

    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info(PaintTheWorld.log("Loaded"));
    }
}
