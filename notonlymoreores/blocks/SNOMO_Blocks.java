package notonlymoreores.blocks;

import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;

public class SNOMO_Blocks {

	// ore sets
	public static final String[] ORE_SETS = { "origum", "yagniss", "grenium", "blosper", "kalfur", "enoudra" };
	
	// color ore and blocks
	public static Block colorOre;
	public static Block colorBlock;

	// initializes all blocks
	public static void initBlocks(){

		colorOre = new BlockColorOre();
		colorBlock = new BlockColorBlock();
	}
	
	// register all blocks
	public static void registerBlocks(){
	
		GameRegistry.registerBlock(colorOre, ItemBlockColorOre.class, colorOre.getUnlocalizedName());
		GameRegistry.registerBlock(colorBlock, ItemBlockColorBlock.class, colorBlock.getUnlocalizedName());
	}
}
