package io.github.butterflymods.painttheworld.init;

import io.github.butterflymods.painttheworld.PaintTheWorld;
import io.github.butterflymods.painttheworld.block.*;
import io.github.butterflymods.painttheworld.item.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class PTWItems {
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, PaintTheWorld.MOD_ID);

	// items
	public static final RegistryObject<Item> PAINTBRUSH = ITEMS.register(PaintbrushItem.id, PaintbrushItem::new);

	// block items
	private static final RegistryObject<BlockItem> DYE_TABLE = ITEMS.register(DyeTableBlock.id, () -> new BlockItem(PTWBlocks.DYE_TABLE.get(), DyeTableBlock.ITEM_PROPERTIES));
}
