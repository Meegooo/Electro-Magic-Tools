package emt.tile.solar.compressed;

import emt.init.EMTBlocks;
import emt.tile.solar.TileEntitySolarBase;
import emt.util.EMTConfigHandler;
import ic2.api.energy.prefab.BasicSource;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class TileEntityDoubleCompressedSolar extends TileEntitySolarBase {

	public TileEntityDoubleCompressedSolar() {
		super();
		energySource = new BasicSource(this, 10000, 4);
		output = EMTConfigHandler.doubleCompressedSolarOutput;
	}

	@Override
	public ItemStack getWrenchDrop(EntityPlayer entityPlayer) {
		return new ItemStack(EMTBlocks.emtSolars, 1, 1);
	}
}
