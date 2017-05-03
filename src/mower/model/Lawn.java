package mower.model;

import java.util.HashSet;
import java.util.Set;

public class Lawn {
	private int width;
	private int height;
	private Set<Position> obstacles;
	
	public Lawn(int width, int height) {
		this.width = width;
		this.height = height;
		obstacles = new HashSet<>();
	}
	
	public boolean isValueInsideWidth(int value) {
		return value >= 0 && value <= width;
	}

	public boolean isValueInsideHeight(int value) {
		return value >= 0 && value <= height;
	}
	
	public boolean addObstacle(Position position) {
		return obstacles.add(position);
	}
	
	public boolean isFreeFor(Position position) {
		return !obstacles.contains(position);
	}
	
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
}
