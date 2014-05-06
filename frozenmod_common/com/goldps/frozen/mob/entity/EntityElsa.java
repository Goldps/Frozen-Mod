package com.goldps.frozen.mob.entity;

import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

public class EntityElsa extends EntityMob {

	public EntityElsa(World par1World) {
		super(par1World);
	}
	
	public EnumCreatureAttribute getCreatureAttribute() {
		return EnumCreatureAttribute.UNDEAD;
	}

}
