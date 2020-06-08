package idiot_with_a_uke.tinkersdecoration.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class SearedBricksDecoration extends BlockBase {

	public SearedBricksDecoration(String name, Material material) {
		
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(0.5F);
		setResistance(20F);
		setHarvestLevel("pickaxe", 0);

	}

}
