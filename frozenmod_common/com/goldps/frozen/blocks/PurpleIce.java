package com.goldps.frozen.blocks;

import com.goldps.frozen.FrozenMod;
import com.goldps.frozen.proxy.Client;
import com.goldps.frozen.reference.ResourceLocs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class PurpleIce extends Block {

	public PurpleIce(int i, Material p_i45394_1_) {
		super(p_i45394_1_);
		this.slipperiness = 0.98f;
		this.setBlockName("PurpleIce");
		this.setBlockTextureName(ResourceLocs.LOC_TEXTURE_PURPLEICE);
		this.setHardness(2.2f);
		this.setCreativeTab(FrozenMod.tabFrozenModBlocks);

	}
}


