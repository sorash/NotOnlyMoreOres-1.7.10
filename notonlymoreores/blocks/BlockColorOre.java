package notonlymoreores.blocks;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import notonlymoreores.main.NotOnlyMoreOresMain;

public class BlockColorOre extends Block {

	// icons array
	private IIcon[] textures;
	
	/* 
	 * constructor
	 * PARAM color of block in meta value
	 */
	protected BlockColorOre() {
	
		super(Material.rock);
		setBlockName("color_ore");
		setCreativeTab(CreativeTabs.tabBlock);
		setStepSound(soundTypePiston);
	}
	
	// register textures for sub-blocks
	@SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister reg) { 
		
		textures = new IIcon[SNOMO_Blocks.ORE_SETS.length];
		
		for(int i = 0; i < SNOMO_Blocks.ORE_SETS.length; i++)
			textures[i] = reg.registerIcon(NotOnlyMoreOresMain.MOD_ID + ":color_ore_" + SNOMO_Blocks.ORE_SETS[i]);
	}
	
	// determine the drop item from meta
	@Override
	public int damageDropped(int meta) {
	    
		return meta;
	}
	
	// add sub-blocks for each meta
	@Override
	public void getSubBlocks(Item item, CreativeTabs creativeTabs, List list) {
		
	    for (int i = 0; i < SNOMO_Blocks.ORE_SETS.length; i ++) {
	        
	    	list.add(new ItemStack(item, 1, i));
	    }
	}
	
	// get icon from meta
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta) {
	
		return textures[meta];
	}
	
	// set hardness based on metadata
	@Override
    public float getBlockHardness(World world, int x, int y, int z)
    {
		
		int meta = world.getBlockMetadata(x, y, z);
		
		switch(meta){
		
		case 0: // origum
			setHarvestLevel("pickaxe", 1);
			return 2.0f;
		case 1: // yagniss
			setHarvestLevel("pickaxe", 1);
			return 3.0f;
		case 2: // grenium
			setHarvestLevel("pickaxe", 2);
			return 3.5f;
		case 3: // blosper
			setHarvestLevel("pickaxe", 2);
			return 4.0f;
		case 4: // kalfur
			setHarvestLevel("pickaxe", 2);
			return 5.0f;
		case 5: // enoudra
			setHarvestLevel("pickaxe", 3);
			return 5.25f;
		
		default:
			return 1.5f;
		}
    }
	
	// set explosion resistance based on metadata
	@Override
    public float getExplosionResistance(Entity entity, World world, int x, int y, int z, double explosionX, double explosionY, double explosionZ)
    {

		int meta = world.getBlockMetadata(x, y, z);
		
		switch(meta){
		
		case 0: // origum
			return 12.0f;
		case 1: // yagniss
			return 13.5f;
		case 2: // grenium
			return 14.0f;
		case 3: // blosper
			return 15.0f;
		case 4: // kalfur
			return 15.5f;
		case 5: // enoudra
			return 17.0f;
		
		default:
			return 1.5f;
		}
    }
}
