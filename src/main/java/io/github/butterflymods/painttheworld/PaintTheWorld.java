package io.github.butterflymods.painttheworld;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PaintTheWorld implements ModInitializer {
    public static final String MOD_ID = "paint-the-world";
    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "item_group"), () -> new ItemStack(Items.BLACK_DYE));
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("[" + MOD_ID + "] Loaded");
    }
}
