package mower.model;

public class Lawn {
	private int width;
	private int height;
	
	public Lawn(String rawLine) {
		String[] arr = rawLine.split(" ");
		width = Integer.valueOf(arr[0]) - 1;
		height = Integer.valueOf(arr[1]) - 1;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
}
