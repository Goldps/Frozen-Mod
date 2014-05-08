package com.goldps.frozen.proxy;

import com.goldps.frozen.mob.entity.EntityElsa;
import com.goldps.frozen.mob.model.ModelElsa;
import com.goldps.frozen.mob.render.RenderElsa;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class Client extends Common {

	@Override
	public void registerRenderThings() {
		RenderingRegistry.registerEntityRenderingHandler(EntityElsa.class, new RenderElsa(new ModelElsa(), 0.3F));
	}
	
}
