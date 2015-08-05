package notonlymoreores.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;

public class SNOMO_Items {

	/*
	 * armor enum materials
	 * 
	 * ---REFERENCE---
	 * 
	 * static ArmorMaterial ARMOR = EnumHelper.addArmorMaterial("NAME", durability, damageReduction[], enchantability);
	 * 
	 * durability:
	 * 5 - leather	15 - chain & iron	7 - gold	33 - diamond
	 * 
	 * damageReduction:
	 * { 1, 3, 2, 1 } - leater	{2, 6, 5, 2} - iron	  {2, 5, 3, 1} - gold	{3, 8, 6, 3} - diamonds (MAX)
	 * 
	 * enchantability
	 * level 30 is the best
	 * 
	 * ----------------
	 */
	public static ArmorMaterial ORIGUM_ARMOR = EnumHelper.addArmorMaterial("ORIGUM_ARMOR", 17, new int[] { 2, 7, 5, 2 }, 30);
	public static ArmorMaterial YAGNISS_ARMOR = EnumHelper.addArmorMaterial("YAGNISS_ARMOR", 21, new int[] { 2, 7, 5, 3 }, 30);
	public static ArmorMaterial GRENIUM_ARMOR = EnumHelper.addArmorMaterial("GRENIUM_ARMOR", 27, new int[] { 3, 7, 5, 3 }, 30);
	public static ArmorMaterial BLOSPER_ARMOR = EnumHelper.addArmorMaterial("BLOSPER_ARMOR", 35, new int[] { 3, 7, 6, 3 }, 30);
	public static ArmorMaterial KALFUR_ARMOR = EnumHelper.addArmorMaterial("KALFUR_ARMOR", 37, new int[] { 3, 7, 6, 3 }, 30);
	public static ArmorMaterial ENOUDRA_ARMOR = EnumHelper.addArmorMaterial("ENOUDRA_ARMOR", 40, new int[] { 3, 8, 6, 3 }, 30);
	
	// all armor pieces
	public static Item origumHelmet;
	public static Item origumChestplate;
	public static Item origumLeggings;
	public static Item origumBoots;
	
	public static Item yagnissHelmet;
	public static Item yagnissChestplate;
	public static Item yagnissLeggings;
	public static Item yagnissBoots;
	
	public static Item greniumHelmet;
	public static Item greniumChestplate;
	public static Item greniumLeggings;
	public static Item greniumBoots;
	
	public static Item blosperHelmet;
	public static Item blosperChestplate;
	public static Item blosperLeggings;
	public static Item blosperBoots;
	
	public static Item kalfurHelmet;
	public static Item kalfurChestplate;
	public static Item kalfurLeggings;
	public static Item kalfurBoots;
	
	public static Item enoudraHelmet;
	public static Item enoudraChestplate;
	public static Item enoudraLeggings;
	public static Item enoudraBoots;
	
	// all tools
	
	// initializes all items
	public static void initItems(){
		
		origumHelmet = new ItemGenericArmor("origum_helmet", ORIGUM_ARMOR, "origum", 0);
		origumChestplate = new ItemGenericArmor("origum_chestplate", ORIGUM_ARMOR, "origum", 1);
		origumLeggings = new ItemGenericArmor("origum_leggings", ORIGUM_ARMOR, "origum", 2);
		origumBoots = new ItemGenericArmor("origum_boots", ORIGUM_ARMOR, "origum", 3);
		
		yagnissHelmet = new ItemGenericArmor("yagniss_helmet", YAGNISS_ARMOR, "yagniss", 0);
		yagnissChestplate = new ItemGenericArmor("yagniss_chestplate", YAGNISS_ARMOR, "yagniss", 1);
		yagnissLeggings = new ItemGenericArmor("yagniss_leggings", YAGNISS_ARMOR, "yagniss", 2);
		yagnissBoots = new ItemGenericArmor("yagniss_boots", YAGNISS_ARMOR, "yagniss", 3);
		
		greniumHelmet = new ItemGenericArmor("grenium_helmet", GRENIUM_ARMOR, "grenium", 0);
		greniumChestplate = new ItemGenericArmor("grenium_chestplate", GRENIUM_ARMOR, "grenium", 1);
		greniumLeggings = new ItemGenericArmor("grenium_leggings", GRENIUM_ARMOR, "grenium", 2);
		greniumBoots = new ItemGenericArmor("grenium_boots", GRENIUM_ARMOR, "grenium", 3);
		
		blosperHelmet = new ItemGenericArmor("blosper_helmet", BLOSPER_ARMOR, "blosper", 0);
		blosperChestplate = new ItemGenericArmor("blosper_chestplate", BLOSPER_ARMOR, "blosper", 1);
		blosperLeggings = new ItemGenericArmor("blosper_leggings", BLOSPER_ARMOR, "blosper", 2);
		blosperBoots = new ItemGenericArmor("blosper_boots", BLOSPER_ARMOR, "blosper", 3);

		kalfurHelmet = new ItemGenericArmor("kalfur_helmet", KALFUR_ARMOR, "kalfur", 0);
		kalfurChestplate = new ItemGenericArmor("kalfur_chestplate", KALFUR_ARMOR, "kalfur", 1);
		kalfurLeggings = new ItemGenericArmor("kalfur_leggings", KALFUR_ARMOR, "kalfur", 2);
		kalfurBoots = new ItemGenericArmor("kalfur_boots", KALFUR_ARMOR, "kalfur", 3);
		
		enoudraHelmet = new ItemGenericArmor("enoudra_helmet", ENOUDRA_ARMOR, "enoudra", 0);
		enoudraChestplate = new ItemGenericArmor("enoudra_chestplate", ENOUDRA_ARMOR, "enoudra", 1);
		enoudraLeggings = new ItemGenericArmor("enoudra_leggings", ENOUDRA_ARMOR, "enoudra", 2);
		enoudraBoots = new ItemGenericArmor("enoudra_boots", ENOUDRA_ARMOR, "enoudra", 3);
	}
	
	// registers all items
	public static void registerItems(){
		
		GameRegistry.registerItem(origumHelmet, origumHelmet.getUnlocalizedName());
		GameRegistry.registerItem(origumChestplate, origumChestplate.getUnlocalizedName());
		GameRegistry.registerItem(origumLeggings, origumLeggings.getUnlocalizedName());
		GameRegistry.registerItem(origumBoots, origumBoots.getUnlocalizedName());

		GameRegistry.registerItem(yagnissHelmet, yagnissHelmet.getUnlocalizedName());
		GameRegistry.registerItem(yagnissChestplate, yagnissChestplate.getUnlocalizedName());
		GameRegistry.registerItem(yagnissLeggings, yagnissLeggings.getUnlocalizedName());
		GameRegistry.registerItem(yagnissBoots, yagnissBoots.getUnlocalizedName());

		GameRegistry.registerItem(greniumHelmet, greniumHelmet.getUnlocalizedName());
		GameRegistry.registerItem(greniumChestplate, greniumChestplate.getUnlocalizedName());
		GameRegistry.registerItem(greniumLeggings, greniumLeggings.getUnlocalizedName());
		GameRegistry.registerItem(greniumBoots, greniumBoots.getUnlocalizedName());
		
		GameRegistry.registerItem(blosperHelmet, blosperHelmet.getUnlocalizedName());
		GameRegistry.registerItem(blosperChestplate, blosperChestplate.getUnlocalizedName());
		GameRegistry.registerItem(blosperLeggings, blosperLeggings.getUnlocalizedName());
		GameRegistry.registerItem(blosperBoots, blosperBoots.getUnlocalizedName());
		
		GameRegistry.registerItem(kalfurHelmet, kalfurHelmet.getUnlocalizedName());
		GameRegistry.registerItem(kalfurChestplate, kalfurChestplate.getUnlocalizedName());
		GameRegistry.registerItem(kalfurLeggings, kalfurLeggings.getUnlocalizedName());
		GameRegistry.registerItem(kalfurBoots, kalfurBoots.getUnlocalizedName());
		
		GameRegistry.registerItem(enoudraHelmet, enoudraHelmet.getUnlocalizedName());
		GameRegistry.registerItem(enoudraChestplate, enoudraChestplate.getUnlocalizedName());
		GameRegistry.registerItem(enoudraLeggings, enoudraLeggings.getUnlocalizedName());
		GameRegistry.registerItem(enoudraBoots, enoudraBoots.getUnlocalizedName());
	}
}
