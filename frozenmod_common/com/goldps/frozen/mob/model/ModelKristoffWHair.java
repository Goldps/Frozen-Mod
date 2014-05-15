package com.goldps.frozen.mob.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelKristoffWHair extends ModelBase
{
  //fields
    ModelRenderer Body;
    ModelRenderer Head;
    ModelRenderer RightArm;
    ModelRenderer LeftArm;
    ModelRenderer RightLeg;
    ModelRenderer LeftLeg;
    ModelRenderer HairFront;
    ModelRenderer HairBack;
    ModelRenderer HairRight;
    ModelRenderer HairLeft;
    ModelRenderer HairTop;
  
  public ModelKristoffWHair()
  {
    textureWidth = 128;
    textureHeight = 128;
    
      Body = new ModelRenderer(this, 16, 16);
      Body.addBox(-4F, 0F, -2F, 8, 12, 4);
      Body.setRotationPoint(0F, 0F, 0F);
      Body.setTextureSize(128, 128);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      Head = new ModelRenderer(this, 0, 0);
      Head.addBox(-4F, -8F, -4F, 8, 8, 8);
      Head.setRotationPoint(0F, 0F, 0F);
      Head.setTextureSize(128, 128);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      RightArm = new ModelRenderer(this, 0, 16);
      RightArm.addBox(-3F, -2F, -2F, 4, 12, 4);
      RightArm.setRotationPoint(-5F, 2F, 0F);
      RightArm.setTextureSize(128, 128);
      RightArm.mirror = true;
      setRotation(RightArm, 0F, 0F, 0F);
      LeftArm = new ModelRenderer(this, 40, 16);
      LeftArm.addBox(-1F, -2F, -2F, 4, 12, 4);
      LeftArm.setRotationPoint(5F, 2F, 0F);
      LeftArm.setTextureSize(128, 128);
      LeftArm.mirror = true;
      setRotation(LeftArm, 0F, 0F, 0F);
      RightLeg = new ModelRenderer(this, 0, 32);
      RightLeg.addBox(-2F, 0F, -2F, 4, 12, 4);
      RightLeg.setRotationPoint(-2F, 12F, 0F);
      RightLeg.setTextureSize(128, 128);
      RightLeg.mirror = true;
      setRotation(RightLeg, 0F, 0F, 0F);
      LeftLeg = new ModelRenderer(this, 16, 32);
      LeftLeg.addBox(-2F, 0F, -2F, 4, 12, 4);
      LeftLeg.setRotationPoint(2F, 12F, 0F);
      LeftLeg.setTextureSize(128, 128);
      LeftLeg.mirror = true;
      setRotation(LeftLeg, 0F, 0F, 0F);
      HairFront = new ModelRenderer(this, 56, 0);
      HairFront.addBox(-5F, -9F, -5F, 10, 9, 0);
      HairFront.setRotationPoint(0F, 0F, 0F);
      HairFront.setTextureSize(128, 128);
      HairFront.mirror = true;
      setRotation(HairFront, 0F, 0F, 0F);
      HairBack = new ModelRenderer(this, 56, 9);
      HairBack.addBox(-5F, -9F, 5F, 10, 9, 0);
      HairBack.setRotationPoint(0F, 0F, 0F);
      HairBack.setTextureSize(128, 128);
      HairBack.mirror = true;
      setRotation(HairBack, 0F, 0F, 0F);
      HairRight = new ModelRenderer(this, 56, 18);
      HairRight.addBox(-5F, -9F, -5F, 0, 9, 10);
      HairRight.setRotationPoint(0F, 0F, 0F);
      HairRight.setTextureSize(128, 128);
      HairRight.mirror = true;
      setRotation(HairRight, 0F, 0F, 0F);
      HairLeft = new ModelRenderer(this, 56, 37);
      HairLeft.addBox(5F, -9F, -5F, 0, 9, 10);
      HairLeft.setRotationPoint(0F, 0F, 0F);
      HairLeft.setTextureSize(128, 128);
      HairLeft.mirror = true;
      setRotation(HairLeft, 0F, 0F, 0F);
      HairTop = new ModelRenderer(this, 46, 56);
      HairTop.addBox(-5F, -9F, -5F, 10, 0, 10);
      HairTop.setRotationPoint(0F, 0F, 0F);
      HairTop.setTextureSize(128, 128);
      HairTop.mirror = true;
      setRotation(HairTop, 0F, 0F, 0F);
  }
  
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(entity, f, f1, f2, f3, f4, f5);
    Body.render(f5);
    Head.render(f5);
    RightArm.render(f5);
    LeftArm.render(f5);
    RightLeg.render(f5);
    LeftLeg.render(f5);
    HairFront.render(f5);
    HairBack.render(f5);
    HairRight.render(f5);
    HairLeft.render(f5);
    HairTop.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  private void setRotationAngles(Entity entity, float time, float walkSpeed, float par2, float rotationYaw, float rotationPitch , float scale)  
  {
	  
	  this.Head.rotateAngleY = rotationYaw / (180F / (float)Math.PI);
	  this.Head.rotateAngleX = rotationPitch / (180F / (float)Math.PI);

	  this.HairFront.rotateAngleY = this.Head.rotateAngleY;
	  this.HairFront.rotateAngleX = this.Head.rotateAngleX;
	  
	  this.HairTop.rotateAngleY = this.Head.rotateAngleY;
	  this.HairTop.rotateAngleX = this.Head.rotateAngleX;
	  
	  this.HairRight.rotateAngleY = this.Head.rotateAngleY;
	  this.HairRight.rotateAngleX = this.Head.rotateAngleX;
	  
	  this.HairLeft.rotateAngleY = this.Head.rotateAngleY;
	  this.HairLeft.rotateAngleX = this.Head.rotateAngleX;
	  
	  this.HairBack.rotateAngleY = this.Head.rotateAngleY;
	  this.HairBack.rotateAngleX = this.Head.rotateAngleX;
	  
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
