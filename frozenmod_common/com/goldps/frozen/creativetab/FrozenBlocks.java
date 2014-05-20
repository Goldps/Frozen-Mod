package com.goldps.frozen.creativetab;

import com.goldps.frozen.FrozenMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class FrozenBlocks extends CreativeTabs {

	public FrozenBlocks(int par1, String par2Str) {
		super(par1, par2Str);
	
	}

	@Override
	public Item getTabIconItem() {
		
		return Item.getItemFromBlock(FrozenMod.PurpleIce);
	}

}
