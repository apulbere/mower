package mower.model;

public class Lawn {
	private int width;
	private int height;

	public Lawn(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public boolean isValueInsideWidth(int value) {
		return value >= 0 && value <= width;
	}

	public boolean isValueInsideHeight(int value) {
		return value >= 0 && value <= height;
	}
	
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
}
