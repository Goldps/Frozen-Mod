package com.goldps.frozen.proxy;

import com.goldps.frozen.mob.entity.EntityElsa;
import com.goldps.frozen.mob.model.ModelElsa;
import com.goldps.frozen.mob.render.RenderElsa;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy {

	public void registerRenderThings() {
		RenderingRegistry.registerEntityRenderingHandler(EntityElsa.class, new RenderElsa(new ModelElsa(), 0.3F));
	}
}
