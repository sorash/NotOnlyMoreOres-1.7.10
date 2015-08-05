package notonlymoreores.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;

public class ItemBlockColorOre extends ItemBlockWithMetadata {

	public ItemBlockColorOre(Block block) {

		super(block, block);
		setHasSubtypes(true);
	}
	
	// return name based on meta
	@Override
	public String getUnlocalizedName(ItemStack stack) {
	    
		int i = stack.getItemDamage();
		
		if(i < 0 || i >= SNOMO_Blocks.ORE_SETS.length)
			i = 0;
		
		return super.getUnlocalizedName() + "_" + SNOMO_Blocks.ORE_SETS[i];
	}
	
	// get meta from sub-blocks
	public int getMetadata(int meta) {
	
		return meta;
	}
}