package io.github.butterflymods.painttheworld;

import io.github.butterflymods.painttheworld.init.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;

public class PaintTheWorld implements ModInitializer {
    public static final String MOD_ID = "painttheworld";
    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "item_group"), () -> new ItemStack(PTWItems.PAINTBRUSH));

    @SuppressWarnings("all")
    @Override
    public void onInitialize() {
        log("Loading");

        new PTWBlocks();
        new PTWItems();

        log("Loaded");
    }

    public static void log(String text) {
        LogManager.getLogger(MOD_ID).info("[Paint the World] " + text);
    }
}
