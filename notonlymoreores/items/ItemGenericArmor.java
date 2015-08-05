package notonlymoreores.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import notonlymoreores.main.NotOnlyMoreOresMain;

public class ItemGenericArmor extends ItemArmor {

	// texture name
	public String materialName;
	
	public ItemGenericArmor(String unlocalizedName, ArmorMaterial mat, String material, int type) {
	    
		super(mat, 0, type);
		materialName = material;
		setCreativeTab(CreativeTabs.tabCombat);
	    setUnlocalizedName(unlocalizedName);
	    setTextureName(NotOnlyMoreOresMain.MOD_ID + ":" + unlocalizedName);
	}
	
	// get armor texture from corresponding file
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		
		return NotOnlyMoreOresMain.MOD_ID + ":textures/armor/" + materialName + "_" + (this.armorType == 2 ? "2" : "1") + ".png";
	}
}
