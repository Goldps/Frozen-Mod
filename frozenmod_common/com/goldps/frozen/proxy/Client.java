package com.goldps.frozen.proxy;

import com.goldps.frozen.mob.entity.EntityAnnaWHair;
import com.goldps.frozen.mob.entity.EntityElsa;
import com.goldps.frozen.mob.model.ModelAnnaWHair;
import com.goldps.frozen.mob.model.ModelElsa;
import com.goldps.frozen.mob.render.RenderAnnaWHair;
import com.goldps.frozen.mob.render.RenderElsa;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class Client extends Common {

	@Override
	public void registerRenderThings() {
		//Render Elsa on client side
		RenderingRegistry.registerEntityRenderingHandler(EntityElsa.class, new RenderElsa(new ModelElsa(), 0.3F));
		
		//Render Anna W/ Hair on client side
		RenderingRegistry.registerEntityRenderingHandler(EntityAnnaWHair.class, new RenderAnnaWHair(new ModelAnnaWHair(), 0.3F));
	}
	
}
