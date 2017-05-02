package mower.model;

import java.util.HashSet;
import java.util.Set;

public class Lawn {
	private int width;
	private int height;
	private Set<Position> obstacles;
	
	public Lawn(String rawLine) {
		String[] arr = rawLine.split(" ");
		width = Integer.valueOf(arr[0]);
		height = Integer.valueOf(arr[1]);
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
