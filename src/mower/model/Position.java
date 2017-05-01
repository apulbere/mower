package mower.model;

import static java.lang.String.format;

import mower.behaviour.Incrementor;

public class Position implements Incrementor {
	private int x;
	private int y;
	
	public Position(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public Position(Position position) {
		this.x = position.x;
		this.y = position.y;
	}
	
	@Override
	public void addToX(int val) {
		x += val;
	}
	
	@Override
	public void addToY(int val) {
		y += val;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public String toString() {
		return format("%s %s", x, y);
	}
}
