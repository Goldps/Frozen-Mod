
package com.goldps.frozen.mob.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelAnnaWHair extends ModelBase
{
  //fields
    ModelRenderer Hair;
    ModelRenderer Head;
    ModelRenderer Body;
    ModelRenderer LeftLeg;
    ModelRenderer RightLeg;
    ModelRenderer LeftArm;
    ModelRenderer RightArm;
  
  public ModelAnnaWHair()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      Hair = new ModelRenderer(this, 0, 0);
      Hair.addBox(0F, 0F, 0F, 10, 9, 10);
      Hair.setRotationPoint(-5F, -9F, -5F);
      Hair.setTextureSize(64, 64);
      Hair.mirror = true;
      setRotation(Hair, 0F, 0F, 0F);
      Head = new ModelRenderer(this, 0, 35);
      Head.addBox(-4F, -8F, -4F, 8, 8, 8);
      Head.setRotationPoint(0F, 0F, 0F);
      Head.setTextureSize(64, 64);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      Body = new ModelRenderer(this, 16, 19);
      Body.addBox(-4F, 0F, -2F, 8, 12, 4);
      Body.setRotationPoint(0F, 0F, 0F);
      Body.setTextureSize(64, 64);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      LeftLeg = new ModelRenderer(this, 0, 19);
      LeftLeg.addBox(-2F, 0F, -2F, 4, 12, 4);
      LeftLeg.setRotationPoint(-2F, 12F, 0F);
      LeftLeg.setTextureSize(64, 64);
      LeftLeg.mirror = true;
      setRotation(LeftLeg, 0F, 0F, 0F);
      RightLeg = new ModelRenderer(this, 40, 19);
      RightLeg.addBox(-2F, 0F, -2F, 4, 12, 4);
      RightLeg.setRotationPoint(2F, 12F, 0F);
      RightLeg.setTextureSize(64, 64);
      RightLeg.mirror = true;
      setRotation(RightLeg, 0F, 0F, 0F);
      LeftArm = new ModelRenderer(this, 32, 35);
      LeftArm.addBox(-3F, -2F, -2F, 4, 12, 4);
      LeftArm.setRotationPoint(-5F, 2F, 0F);
      LeftArm.setTextureSize(64, 64);
      LeftArm.mirror = true;
      setRotation(LeftArm, 0F, 0F, 0F);
      RightArm = new ModelRenderer(this, 48, 35);
      RightArm.addBox(-1F, -2F, -2F, 4, 12, 4);
      RightArm.setRotationPoint(5F, 2F, 0F);
      RightArm.setTextureSize(64, 64);
      RightArm.mirror = true;
      setRotation(RightArm, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(entity, f, f1, f2, f3, f4, f5);
    Hair.render(f5);
    Head.render(f5);
    Body.render(f5);
    LeftLeg.render(f5);
    RightLeg.render(f5);
    LeftArm.render(f5);
    RightArm.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }

  private void setRotationAngles(Entity entity, float time, float walkSpeed, float par2, float rotationYaw, float rotationPitch , float scale  )
  {
	  
	  this.Head.rotateAngleY = rotationYaw / (180F / (float)Math.PI);
	  this.Head.rotateAngleX = rotationPitch / (180F / (float)Math.PI);

	  this.Hair.rotateAngleY = this.Head.rotateAngleY;
	  this.Hair.rotateAngleX = this.Head.rotateAngleX;
	  
	  this.RightLeg.rotateAngleX = MathHelper.cos(time * 0.6662F) * 1.4F * walkSpeed;
	  this.LeftLeg.rotateAngleX = MathHelper.cos(time * 0.6662F + 3.1415927F) * 1.4F * walkSpeed;
	  
	  this.RightLeg.rotateAngleY = 0.0F;
	  this.LeftLeg.rotateAngleY = 0.0F;
	  
	  this.RightArm.rotateAngleX = MathHelper.cos(time * 0.6662F) * 1.4F * walkSpeed;
	  this.LeftArm.rotateAngleX = MathHelper.cos(time * 0.6662F + 3.1415927F) * 1.4F * walkSpeed;
	  
	  this.RightArm.rotateAngleY = 0.0F;
	  this.LeftArm.rotateAngleY = 0.0F;
  }

}
