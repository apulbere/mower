package mower.model;

import static java.lang.String.format;

public class Mower {
	private Orientation orientation;
	private Position position;
	
	public Mower(Position position, Orientation orientation) {
		this.position = position;
		this.orientation = orientation;
	}
	
	public void setPosition(Position position) {
		this.position = position;
	}

	public Position getPosition() {
		return position;
	}

	public Orientation getOrientation() {
		return orientation;
	}

	public void setOrientation(Orientation orientation) {
		this.orientation = orientation;
	}
	
	public String getFormatedPosition() {
		return format("%s %s", position.getFormatedPosition(), orientation.name());
	}
}
