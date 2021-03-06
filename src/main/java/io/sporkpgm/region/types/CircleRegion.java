package io.sporkpgm.region.types;

import org.bukkit.util.Vector;

public class CircleRegion extends CylinderRegion {

	public CircleRegion(String name, BlockRegion centre, double radius, boolean hollow) {
		super(name, new BlockRegion(centre.getStringX(), "-oo", centre.getStringZ()), radius, 1, hollow);
	}

	@Override
	public boolean isInside(BlockRegion block) {
		Vector point = new Vector(block.getX(), block.getY(), block.getZ());
		return Math.pow(point.getX() - origin.getX(), 2.0D) + Math.pow(point.getZ() - origin.getZ(), 2.0D) < (radius * radius);
	}

}
