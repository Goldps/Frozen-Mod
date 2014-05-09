package com.goldps.frozen.mob.entity;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityAnnaWHair extends EntityLiving {
	
	public EntityAnnaWHair(World par1World) {
		super(par1World);
		this.setSize(0.9F, 1.3F);
		this.tasks.addTask(0, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
		this.tasks.addTask(1, new EntityAISwimming(this));
	}
	
	protected boolean isAIEnabled() {
		return true;
	}
	
	protected void playStepSound(int par1, int par2, int par3, int par4) {
		this.worldObj.playSoundAtEntity(this, "mob.zombie.step", 0.15F, 1.0F);
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
