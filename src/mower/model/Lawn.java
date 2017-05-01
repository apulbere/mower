package mower.model;

public class Lawn {
	private int width;
	private int height;
	
	public Lawn(String rawLine) {
		String[] arr = rawLine.split(" ");
		width = Integer.valueOf(arr[0]);
		height = Integer.valueOf(arr[1]);
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
