package com.goldps.frozen;

import com.goldps.frozen.creativetab.CreativeTab;
import com.goldps.frozen.mob.entity.EntityElsa;
import com.goldps.frozen.mob.model.ModelElsa;
import com.goldps.frozen.mob.render.*;
import com.goldps.frozen.proxy.IProxy;
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
	//@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	//public static IProxy proxy;

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
		// some example code
        //System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());
    	
    	//Changes name of creative tabs
    	//LanguageRegistry.instance().addStringLocalization("itemGroup.tabFrozenModItems", "en_US", "Frozen Mod Items");
    	//LanguageRegistry.instance().addStringLocalization("itemGroup.tabFrozenModBlocks", "en_US", "Frozen Mod Blocks");
    	
    	//adds entity Elsa
    	EntityRegistry.registerModEntity(EntityElsa.class, "Elsa", 1, this, 80, 3, true);
    	//RenderingRegistry.registerEntityRenderingHandler(EntityElsa.class, new RenderElsa(new ModelElsa(), 0.3f));
    	
    	for(BiomeGenBase i : BiomeGenBase.getBiomeGenArray()) {
    		if(i != null)
    		{
    			EntityRegistry.addSpawn(EntityElsa.class, 10, 3, 6, EnumCreatureType.creature, i);
    		}
    	}
    	
    	//LanguageRegistry.instance().addStringLocalization("entity.FrozenMod.Elsa.name", "Elsa");
        //EntityList.entityEggs.put(1, new n(1, 0xeaeae9, 0xc99a03));
    }

	@EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	
    }
}
