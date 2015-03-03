package Aer.techmod;

import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "tm", name = "Aer's Tech Mod", version = "1.0")
public class Aertechmod {
	
	public static Item itemCopperIngot;
	public static Item itemTinIngot;
	public static Item itemLeadIngot;
	public static Item itemSilverIngot;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		
		itemCopperIngot = new ItemCoperIngot().setUnlocalizedName("ItemCopperIngot").setTextureName("TM:itemCopperIngot");
		GameRegistry.registerItem(itemCopperIngot, itemCopperIngot.getUnlocalizedName().substring(5));
		
		itemTinIngot = new ItemTinIngot().setUnlocalizedName("ItemTinIngot").setTextureName("tm:itemTinIngot");
		GameRegistry.registerItem(itemTinIngot, itemTinIngot.getUnlocalizedName().substring(5));
		
		itemLeadIngot = new ItemLeadIngot().setUnlocalizedName("ItemLeadIngot").setTextureName("tm:itemLeadIngot");
		GameRegistry.registerItem(itemLeadIngot, itemLeadIngot.getUnlocalizedName().substring(5));
		
		itemSilverIngot = new ItemSilverIngot().setUnlocalizedName("ItemSilverIngot").setTextureName("tm:itemSilverIngot");
		GameRegistry.registerItem(itemSilverIngot, itemSilverIngot.getUnlocalizedName().substring(5));
		}
	@EventHandler
	public void Init(FMLInitializationEvent event){
		
	}
	@EventHandler
	public void postInit(FMLInitializationEvent event){
		
	}
}

