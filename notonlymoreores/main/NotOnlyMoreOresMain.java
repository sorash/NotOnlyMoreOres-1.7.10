package notonlymoreores.main;

import notonlymoreores.blocks.SNOMO_Blocks;
import notonlymoreores.items.SNOMO_Items;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(name = NotOnlyMoreOresMain.MOD_NAME, modid = NotOnlyMoreOresMain.MOD_ID, version = NotOnlyMoreOresMain.MOD_VERSION)

public class NotOnlyMoreOresMain {

	// mod constants
	public static final String MOD_ID = "snomo";
	public static final String MOD_VERSION = "v3.0";
	public static final String MOD_NAME = "Skorpio's NotOnlyMoreOres Mod Reborn";
	
	// proxy settings
	@SidedProxy(clientSide = "notonlymoreores.main.ClientProxy", serverSide = "notonlymoreores.main.ServerProxy")
	private static ServerProxy proxy;
	
    // instance
    @Instance(MOD_ID)
    public static NotOnlyMoreOresMain instance;
	
    /*
     * Preload
     */
    @EventHandler
    public void PreInit(FMLPreInitializationEvent event)
    {
    
    	// init blocks and items
    	SNOMO_Blocks.initBlocks();
    	SNOMO_Items.initItems();
    	
    	// register proxy stuff here
    }
    
    /*
     * Load
     */
    @EventHandler
    public void Init(FMLInitializationEvent event)
    {
    	
    	// register blocks and items
    	SNOMO_Blocks.registerBlocks();
    	SNOMO_Items.registerItems();
    }
}
