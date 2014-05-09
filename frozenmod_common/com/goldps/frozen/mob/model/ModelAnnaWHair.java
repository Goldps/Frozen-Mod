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
    int textureWidth = 64;
    int textureHeight = 64;
    
      Hair = new ModelRenderer(this, 1, 12);
      Hair.addBox(0F, 0F, 0F, 10, 9, 10);
      Hair.setRotationPoint(-5F, -9F, -5F);
      Hair.setTextureSize(textureWidth, textureHeight);
      Hair.mirror = true;
      setRotation(Hair, 0F, 0F, 0F);
      Head = new ModelRenderer(this, 1, 47);
      Head.addBox(-4F, -8F, -4F, 8, 8, 8);
      Head.setRotationPoint(0F, 0F, 0F);
      Head.setTextureSize(textureWidth, textureHeight);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      Body = new ModelRenderer(this, 17, 31);
      Body.addBox(-4F, 0F, -2F, 8, 12, 4);
      Body.setRotationPoint(0F, 0F, 0F);
      Body.setTextureSize(textureWidth, textureHeight);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      LeftLeg.mirror = true;
      LeftLeg = new ModelRenderer(this, 48, 0);
      LeftLeg.addBox(-2F, 0F, -2F, 4, 12, 4);
      LeftLeg.setRotationPoint(-2F, 12F, 0F);
      LeftLeg.setTextureSize(textureWidth, textureHeight);
      LeftLeg.mirror = true;
      setRotation(LeftLeg, 0F, 0F, 0F);
      LeftLeg.mirror = false;
      RightLeg = new ModelRenderer(this, 1, 31);
      RightLeg.addBox(-2F, 0F, -2F, 4, 12, 4);
      RightLeg.setRotationPoint(2F, 12F, 0F);
      RightLeg.setTextureSize(textureWidth, textureHeight);
      RightLeg.mirror = true;
      setRotation(RightLeg, 0F, 0F, 0F);
      LeftArm.mirror = true;
      LeftArm = new ModelRenderer(this, 48, 0);
      LeftArm.addBox(-3F, -2F, -2F, 4, 12, 4);
      LeftArm.setRotationPoint(-5F, 2F, 0F);
      LeftArm.setTextureSize(textureWidth, textureHeight);
      LeftArm.mirror = true;
      setRotation(LeftArm, 0F, 0F, 0F);
      LeftArm.mirror = false;
      RightArm = new ModelRenderer(this, 33, 47);
      RightArm.addBox(-1F, -2F, -2F, 4, 12, 4);
      RightArm.setRotationPoint(5F, 2F, 0F);
      RightArm.setTextureSize(textureWidth, textureHeight);
      RightArm.mirror = true;
      setRotation(RightArm, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
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
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
