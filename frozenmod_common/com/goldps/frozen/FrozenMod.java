package com.goldps.frozen;

import java.util.ArrayList;

import com.goldps.frozen.creativetab.CreativeTab;
import com.goldps.frozen.mob.entity.EntityAnnaWHair;
import com.goldps.frozen.mob.entity.EntityElsa;
import com.goldps.frozen.mob.model.ModelElsa;
import com.goldps.frozen.mob.render.*;
import com.goldps.frozen.proxy.Client;
import com.goldps.frozen.proxy.Common;
import com.goldps.frozen.reference.Reference;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterators;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.projectile.EntityEgg;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = Reference.MODID, version = Reference.MODVERSION, name = Reference.MODNAME)
public class FrozenMod
{
	@Instance(value = "mod")
	public static FrozenMod instance;
	
	//Proxy setup
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static Common CommonProxy;

	//Global variables
	public int MOB_ID = 0;
	public int ITEM_ID = 500;
	
	//Creative Tabs
	//Creative tab for items in the mod
	public static CreativeTabs tabFrozenModItems = new CreativeTabs("tabFrozenModItems") {
		public Item getTabIconItem() {
			return new Item();
		}
	};
	
	//Creative tab for blocks in the mod
	public static CreativeTabs tabFrozenModSpawnEggs = new CreativeTabs("tabFrozenModSpawnEggs") {
		public Item getTabIconItem() {
			return Items.spawn_egg;
		}
	};
	
	/*
	//Creative tab for blocks in the mod
	public static CreativeTabs tabFrozenModBlocks = new CreativeTabs("tabFrozenModBlocks") {
		public Item getTabIconItem() {
			return new Item();
		}
	};
	*/

	//Event Handlers
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
    	
    	//adds entity Elsa
    	EntityRegistry.registerModEntity(EntityElsa.class, "Elsa", MOB_ID, this, 80, 3, true);
    	EntityList.addMapping(EntityElsa.class, "Elsa", ITEM_ID, 0x75FAFA, 0x161EFA);
    	
    	incrementIDs();
    	
    	//adds entity Anna
    	EntityRegistry.registerModEntity(EntityAnnaWHair.class, "Anna", MOB_ID, this, 80, 3, true);
    	EntityList.addMapping(EntityAnnaWHair.class, "Anna", ITEM_ID, 0x7D9810, 0x465215);
    
    	incrementIDs();
    	
    	//adds entity Kristoff

    	incrementIDs();
    	
    	//adds entity Olaf
    	
    	
    	incrementIDs();
    	
    	//adds entity Hans
    	
    	
    	incrementIDs();
    	
    	//Goes through all biomes and adds entity mobs to spawn
    	for(int i = 0; i < BiomeGenBase.getBiomeGenArray().length - 1; i++) {
    		if(BiomeGenBase.getBiomeGenArray()[i] != null)
    		{
    			EntityRegistry.addSpawn(EntityElsa.class, 20, 3, 6, EnumCreatureType.creature, BiomeGenBase.getBiomeGenArray()[i]);
    			EntityRegistry.addSpawn(EntityAnnaWHair.class, 20, 3, 6, EnumCreatureType.creature, BiomeGenBase.getBiomeGenArray()[i]);
    		}
    	}
    	
    	//Calls proxy client to register and render things on client
    	CommonProxy.registerRenderThings();
	}

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	
    }

	@EventHandler
    public void postInit(FMLPostInitializationEvent event) {
		
    }
	
	public void incrementIDs() {
		MOB_ID++;
		ITEM_ID++;
	}
}
