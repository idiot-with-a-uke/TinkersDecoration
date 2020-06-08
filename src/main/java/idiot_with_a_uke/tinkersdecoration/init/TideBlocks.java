package idiot_with_a_uke.tinkersdecoration.init;

import java.util.ArrayList;
import java.util.List;

import idiot_with_a_uke.tinkersdecoration.blocks.SearedBricksDecoration;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class TideBlocks {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block SEARED_BRICKS_DECORATION = new SearedBricksDecoration("seared_bricks_decoration", Material.GROUND);

}
