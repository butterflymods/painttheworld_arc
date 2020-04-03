package io.github.butterflymods.painttheworld.init;

import io.github.butterflymods.painttheworld.PaintTheWorld;
import io.github.butterflymods.painttheworld.block.*;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class PTWBlocks {
	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, PaintTheWorld.MOD_ID);

	public static final RegistryObject<Block> DYE_TABLE = BLOCKS.register(DyeTableBlock.id, DyeTableBlock::new);

//	public static Block cream_concrete_powder;
//	public static Block cream_concrete;
//	public static Block cream_stained_glass_pane;
//	public static Block cream_terracotta;
//	public static Block cream_wool;
//	public static Block dye_table;
}
