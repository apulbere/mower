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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Position other = (Position) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
	public String getFormatedPosition() {
		return format("%s %s", x, y);
	}
}
