package Aer.techmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
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
	public static Item itemCopperGravel;// needs texture
	public static Item itemTinGravel;
	public static Item itemLeadGravel;
	public static Item itemSilverGravel;
	public static Item itemIronGravel;
	public static Item itemGoldGravel;
	public static Item itemDirtyCopperDust;
	public static Item itemDirtyTinDust;
	public static Item itemDirtyLeadDust;
	public static Item itemDirtySilverDust;
	public static Item itemDirtyIronDust;
	public static Item itemDirtyGoldDust;
	public static Item itemCopperDust;
	public static Item itemTinDust;
	public static Item itemLeadDust;
	public static Item itemSilverDust;
	public static Item itemIronDust;
	public static Item itemGoldDust;
	//Blocks
	public static Block blockCopperBlock;
	public static Block blockTinBlock;
	public static Block blockLeadBlock;
	public static Block blockSilverBlock;
	
		
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		//Ore 
		itemCopperIngot = new ItemCoperIngot().setUnlocalizedName("ItemCopperIngot").setTextureName("TM:itemCopperIngot");
    	GameRegistry.registerItem(itemCopperIngot, itemCopperIngot.getUnlocalizedName().substring(5));
    	itemCopperGravel = new ItemCopperGravel().setUnlocalizedName("itemCopperGravel");
    	GameRegistry.registerItem(itemCopperGravel, itemCopperGravel.getUnlocalizedName().substring(5));   	
    	itemDirtyCopperDust = new ItemDirtyCopperDust().setUnlocalizedName("itemDirtyCopperDust");
    	GameRegistry.registerItem(itemDirtyCopperDust, itemDirtyCopperDust.getUnlocalizedName().substring(5));
    	itemCopperDust = new ItemCopperDust().setUnlocalizedName("ItemCopperDust");
    	GameRegistry.registerItem(itemCopperDust, itemCopperDust.getUnlocalizedName().substring(5));
    	
		itemTinIngot = new ItemTinIngot().setUnlocalizedName("ItemTinIngot").setTextureName("tm:itemTinIngot");
		GameRegistry.registerItem(itemTinIngot, itemTinIngot.getUnlocalizedName().substring(5));
		itemTinGravel = new ItemTinGravel().setUnlocalizedName("ItemTinGravel");
		GameRegistry.registerItem(itemTinGravel, itemTinGravel.getUnlocalizedName().substring(5));
		itemDirtyTinDust = new ItemDirtyTinDust().setUnlocalizedName("itemDirtyTinDust");
		GameRegistry.registerItem(itemDirtyTinDust, itemDirtyTinDust.getUnlocalizedName().substring(5));
		itemTinDust = new ItemTinDust().setUnlocalizedName("ItemTinDust");
		GameRegistry.registerItem(itemTinDust, itemTinDust.getUnlocalizedName().substring(5));
		
		itemLeadIngot = new ItemLeadIngot().setUnlocalizedName("ItemLeadIngot").setTextureName("tm:itemLeadIngot");
		GameRegistry.registerItem(itemLeadIngot, itemLeadIngot.getUnlocalizedName().substring(5));
		itemLeadGravel = new ItemLeadGravel().setUnlocalizedName("ItemLeadGravel");
		GameRegistry.registerItem(itemLeadGravel, itemLeadGravel.getUnlocalizedName().substring(5));
		itemDirtyLeadDust = new ItemDirtyLeadDust().setUnlocalizedName("ItemDirtyLeadDust");
		GameRegistry.registerItem(itemDirtyLeadDust, itemDirtyLeadDust.getUnlocalizedName().substring(5));
		itemLeadDust = new ItemLeadDust().setUnlocalizedName("ItemLeadDust");
		GameRegistry.registerItem(itemLeadDust, itemLeadDust.getUnlocalizedName().substring(5));
		
		itemSilverIngot = new ItemSilverIngot().setUnlocalizedName("ItemSilverIngot").setTextureName("tm:itemSilverIngot");
		GameRegistry.registerItem(itemSilverIngot, itemSilverIngot.getUnlocalizedName().substring(5));
		itemSilverGravel = new ItemSilverGravel().setUnlocalizedName("ItemSilverGravel");
		GameRegistry.registerItem(itemSilverGravel, itemSilverGravel.getUnlocalizedName().substring(5));
		itemDirtySilverDust = new ItemDirtySilverDust().setUnlocalizedName("ItemDirtySIlverDust");
		GameRegistry.registerItem(itemDirtySilverDust, itemDirtySilverDust.getUnlocalizedName().substring(5));
		itemSilverDust = new ItemSilverDust().setUnlocalizedName("ItemSilverDust");
		GameRegistry.registerItem(itemSilverDust, itemSilverDust.getUnlocalizedName().substring(5));
		
		itemIronGravel = new ItemIronGravel().setUnlocalizedName("ItemIronGravel");
		GameRegistry.registerItem(itemIronGravel, itemIronGravel.getUnlocalizedName().substring(5));
		itemDirtyIronDust = new ItemDirtyIronDust().setUnlocalizedName("ItemDirtyIronDust");
		GameRegistry.registerItem(itemDirtyIronDust, itemDirtyIronDust.getUnlocalizedName().substring(5));
		itemGoldGravel = new ItemGoldGravel().setUnlocalizedName("ItemGoldGravel");
		GameRegistry.registerItem(itemGoldGravel, itemGoldGravel.getUnlocalizedName().substring(5));
		itemDirtyGoldDust = new ItemDirtyGoldDust().setUnlocalizedName("ItemDirtyGoldDust");
		GameRegistry.registerItem(itemDirtyGoldDust, itemDirtyGoldDust.getUnlocalizedName().substring(5));
		itemIronDust = new ItemIronDust().setUnlocalizedName("ItemIronDust");
		GameRegistry.registerItem(itemIronDust, itemIronDust.getUnlocalizedName().substring(5));
		itemGoldDust = new ItemGoldDust().setUnlocalizedName("ItemGoldDust");
		GameRegistry.registerItem(itemGoldDust, itemGoldDust.getUnlocalizedName().substring(5));
		
		//Crafting Items
		
		
		//Blocks
		blockCopperBlock = new BlockCopperBlock(Material.iron).setBlockName("BlockCopperBlock");
		GameRegistry.registerBlock(blockCopperBlock, blockCopperBlock.getUnlocalizedName().substring(5));
		blockTinBlock = new BlockTinBlock(Material.iron).setBlockName("BlockTinBlock");
		GameRegistry.registerBlock(blockTinBlock, blockTinBlock.getUnlocalizedName().substring(5));
		blockLeadBlock = new BlockLeadBlock(Material.iron).setBlockName("BlockLeadBlock");
		GameRegistry.registerBlock(blockLeadBlock, blockLeadBlock.getUnlocalizedName().substring(5));
		blockSilverBlock = new BlockSilverBlock(Material.iron).setBlockName("BlockSilverBlock");
		GameRegistry.registerBlock(blockSilverBlock, blockSilverBlock.getUnlocalizedName().substring(5));
		
		//Functioning blocks
		
		}
	@EventHandler
	public void Init(FMLInitializationEvent event){
		GameRegistry.addRecipe(new ItemStack(blockCopperBlock), new Object[]{"CCC",
			                                                                 "CCC",
			                                                                 "CCC", 'C',itemCopperIngot});
		 GameRegistry.addRecipe(new ItemStack(itemCopperIngot, 9), new Object[]{"B", 'B',blockCopperBlock });
		 GameRegistry.addRecipe(new ItemStack(blockTinBlock), new Object[]{"TTT",
			                                                               "TTT",
			                                                               "TTT", 'T',itemTinIngot});
		 GameRegistry.addRecipe(new ItemStack(itemTinIngot, 9), new Object[]{"B", 'B',blockTinBlock});
		 GameRegistry.addRecipe(new ItemStack(blockLeadBlock), new Object[]{"LLL",
			 																"LLL",
			 																"LLL", 'L',itemLeadIngot});
		 GameRegistry.addRecipe(new ItemStack(itemLeadIngot, 9), new Object[]{"B", 'B',blockLeadBlock});
		 GameRegistry.addRecipe(new ItemStack(blockSilverBlock), new Object[]{"SSS",
			                                                                  "SSS",
			                                                                  "SSS", 'S',itemSilverIngot});
		 GameRegistry.addRecipe(new ItemStack(itemSilverIngot, 9), new Object[]{"B", 'B', blockSilverBlock});
		 
		 
	}
	@EventHandler
	public void postInit(FMLInitializationEvent event){
		
	}
}

