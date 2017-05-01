package mower.service;

import mower.model.Lawn;
import mower.model.Mower;

public class MowerMover {
	
	public void move(Lawn lawn, Mower mower, String commands) {
		for(String command: commands.split("")) {
			switch (command) {
			case "L":
			case "R":
				mower.setOrientation(command);
				break;
			case "F":
				move(lawn, mower);
				break;
			default:
				throw new IllegalStateException();
			}
		}
	}
	
	private void move(Lawn lawn, Mower mower) {
		switch (mower.getOrientation()) {
		case N:
			if(mower.getY() + 1 <= lawn.getHeight()) {
				mower.moveY(1);
			}
			break;
		case S:
			if(mower.getY() - 1 > 0) {
				mower.moveY(-1);
			}
			break;
		case E:
			if(mower.getX() + 1 >= lawn.getWidth()) {
				mower.moveX(1);
			}
			break;
		case W:
			if(mower.getX() - 1 > 0) {
				mower.moveX(-1);
			}
			break;
		}
	}
}
