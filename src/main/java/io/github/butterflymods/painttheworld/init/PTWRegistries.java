package io.github.butterflymods.painttheworld.init;

import io.github.butterflymods.painttheworld.util.CustomItemGroup;
import io.github.butterflymods.painttheworld.PaintTheWorld;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.Logger;

@Mod.EventBusSubscriber(bus= Mod.EventBusSubscriber.Bus.MOD)
public class PTWRegistries {
    public static final String MOD_ID = PaintTheWorld.MOD_ID;
    public static final ItemGroup ITEM_GROUP = new CustomItemGroup(MOD_ID, Items.BLACK_DYE);
    public static final Logger LOGGER = PaintTheWorld.LOGGER;

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll (
//                        PTWItems.<item> = simpleItem("<item>");
                );

        registerBlockItems(event);

        LOGGER.info("[" + PaintTheWorld.MOD_NAME + "] Registered items");
    }

    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll (
//                        PTWBlocks.<block> = <blockconfig>;
                );

        LOGGER.info("[" + PaintTheWorld.MOD_NAME + "] Registered blocks");
    }
    public static void registerBlockItems(final RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll (
//                        PTWItems.<block> = simpleBlockItem(PTWBlocks.<block>, "<block>");
                );
    }

    // simple templates
    static Item simpleItem(String id) {
        return new Item(defaultProperties()).setRegistryName(location(id));
    }
    static BlockItem simpleBlockItem(Block block, String id) {
        return (BlockItem) new BlockItem(block, defaultProperties()).setRegistryName(location(id));
    }

    // utils
    static ResourceLocation location(String id) {
        return new ResourceLocation(MOD_ID, id);
    }
    static Item.Properties defaultProperties() {
        return new Item.Properties().group(ITEM_GROUP);
    }
}
