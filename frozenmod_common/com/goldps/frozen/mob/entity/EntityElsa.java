package com.goldps.frozen.mob.entity;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityElsa extends EntityLiving {
	
	public EntityElsa(World par1World) {
		super(par1World);
		this.setSize(0.9F, 1.3F);
	}
	
    @Override
    protected String getLivingSound()
    {
        return null;//"yourmod:YourSound";//this refers to:yourmod/sound/YourSound
    }

    @Override
    protected String getHurtSound()
    {
        return null;//"yourmod:optionalFile.YourSound";//this refers to:yourmod/sound/optionalFile/YourSound
    }

    @Override
    protected String getDeathSound()
    {
        return null;// "yourmod:optionalFile.optionalFile2.YourSound";//etc.
    }

    @Override
    protected float getSoundVolume()
    {
        return 0.4F;
    }
}
