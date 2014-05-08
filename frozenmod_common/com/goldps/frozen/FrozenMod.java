package com.goldps.frozen;

import com.goldps.frozen.creativetab.CreativeTab;
import com.goldps.frozen.mob.entity.EntityElsa;
import com.goldps.frozen.mob.model.ModelElsa;
import com.goldps.frozen.mob.render.*;
import com.goldps.frozen.proxy.Common;
import com.goldps.frozen.reference.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.projectile.EntityEgg;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = Reference.MODID, version = Reference.MODVERSION, name = Reference.MODNAME)
public class FrozenMod
{
	//Proxy setup
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static Common proxy;

	//Creative Tabs
	public static CreativeTabs tabFrozenModItems = new CreativeTabs("tabFrozenModItems") {
		public Item getTabIconItem() {
			return new Item();
		}
	};
	
	public static CreativeTabs tabFrozenModBlocks = new CreativeTabs("tabFrozenModBlocks") {
		public Item getTabIconItem() {
			return new Item();
		}
	};
	
	//Event Handlers
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
	}

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	//Mobs
    	int id = 0;
    	//adds entity Elsa
    	EntityRegistry.registerModEntity(EntityElsa.class, "Elsa", 1, this, 80, 3, true);
    	
    	//adds mobs to all biomes
    	for(BiomeGenBase i : BiomeGenBase.getBiomeGenArray()) {
    		if(i != null)
    		{
    			EntityRegistry.addSpawn(EntityElsa.class, 10, 3, 6, EnumCreatureType.creature, i);
    		}
    	}
 
    	//proxy.registerRenderThings();
        //EntityList.entityEggs.put(1, new n(1, 0xeaeae9, 0xc99a03));
    }

	@EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	
    }
}
