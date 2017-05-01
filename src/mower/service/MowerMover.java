package mower.service;

import static java.lang.String.format;

import mower.model.Lawn;
import mower.model.Mower;
import mower.model.Position;

public class MowerMover {
	
	public void move(Lawn lawn, Mower mower, String commands) {
		for(String command: commands.split("")) {
			switch (command) {
			case "L":
				mower.setOrientation(mower.getOrientation().left());
				break;
			case "R":
				mower.setOrientation(mower.getOrientation().right());
				break;
			case "F":
				move(lawn, mower);
				break;
			default:
				throw new UnsupportedOperationException(format("Such command '%s' isn't implemented !", command));
			}
		}
	}
	
	private Position determineNewPosition(Mower mower) {
		Position newPosition = new Position(mower.getPosition());
		mower.getOrientation().move(newPosition);
		return newPosition;
	}
	
	private boolean isPositionOk(Lawn lawn, Position position) {
		return lawn.isValueInsideWidth(position.getX()) && lawn.isValueInsideHeight(position.getY());
	}
	
	private void move(Lawn lawn, Mower mower) {
		Position position = determineNewPosition(mower);
		if(isPositionOk(lawn, position)) {
			mower.setPosition(position);
		}
	}
}