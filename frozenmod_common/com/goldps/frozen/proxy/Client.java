package com.goldps.frozen.proxy;

import com.goldps.frozen.mob.entity.EntityAnnaWHair;
import com.goldps.frozen.mob.entity.EntityElsaWHair;
import com.goldps.frozen.mob.entity.EntityKristoffWHair;
import com.goldps.frozen.mob.model.ModelAnnaWHair;
import com.goldps.frozen.mob.model.ModelElsaWHair;
import com.goldps.frozen.mob.model.ModelKristoffWHair;
import com.goldps.frozen.mob.render.RenderAnnaWHair;
import com.goldps.frozen.mob.render.RenderElsaWHair;
import com.goldps.frozen.mob.render.RenderKristoffWHair;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class Client extends Common {

	@Override
	public void registerRenderThings() {
		//Render Elsa on client side
		RenderingRegistry.registerEntityRenderingHandler(EntityElsaWHair.class, new RenderElsaWHair(new ModelElsaWHair(), 0.3F));
		
		//Render Anna W/ Hair on client side
		RenderingRegistry.registerEntityRenderingHandler(EntityAnnaWHair.class, new RenderAnnaWHair(new ModelAnnaWHair(), 0.3F));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityKristoffWHair.class, new RenderKristoffWHair(new ModelKristoffWHair(), 0.3F));
	}
	
}
