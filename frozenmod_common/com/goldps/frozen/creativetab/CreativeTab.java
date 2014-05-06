package com.goldps.frozen.creativetab;

import com.goldps.frozen.reference.Reference;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CreativeTab {
	public static final CreativeTabs FROZEN_TAB = new CreativeTabs(Reference.MODID) {
		@Override
		public Item getTabIconItem() {
			return Items.diamond;
		}
		
		@Override
		@SideOnly(Side.CLIENT)
		public String getTranslatedTabLabel() {
			return Reference.MODNAME;
		}
	};
}
