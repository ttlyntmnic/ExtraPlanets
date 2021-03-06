package com.mjr.extraplanets.itemBlocks.planetAndMoons;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

import com.mjr.extraplanets.itemBlocks.ItemBlockDefaults;

public class ItemBlockKepler22b extends ItemBlockDefaults {
	public ItemBlockKepler22b(Block block) {
		super(block);
	}

	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		String name = "";

		switch (itemstack.getItemDamage()) {
		case 0: {
			name = "Dirt";
			break;
		}
		case 1: {
			name = "Stone";
			break;
		}
		case 2: {
			name = "OreIron";
			break;
		}
		case 3: {
			name = "OreCopper";
			break;
		}
		case 4: {
			name = "OreTin";
			break;
		}
		case 5: {
			name = "OreDenseCoal";
			break;
		}
		case 6: {
			name = "OreBlueDiamonds";
			break;
		}
		case 7: {
			name = "OreRedDiamonds";
			break;
		}
		case 8: {
			name = "OrePurpleDiamonds";
			break;
		}
		case 9: {
			name = "OreYellowDiamonds";
			break;
		}
		case 10: {
			name = "OreGreenDiamonds";
			break;
		}
		case 11: {
			name = "StoneBricks";
			break;
		}
		case 12: {
			name = "Cobblestone";
			break;
		}
		default:
			name = "null";
		}
		return this.field_150939_a.getUnlocalizedName() + "." + name;
	}
}