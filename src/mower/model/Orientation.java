package mower.model;

import java.util.function.Consumer;

import mower.behaviour.Incrementor;

public enum Orientation {
	N, S, W, E;
	
	private Orientation left;
	private Orientation right;
	private Consumer<Incrementor> consumer;
	
	static {
		N.left = W;
		N.right = E;
		N.consumer = incrementor -> incrementor.addToY(1);
		
		S.left = E;
		S.right = W;
		S.consumer = incrementor -> incrementor.addToY(-1);
		
		W.left = S;
		W.right = N;
		W.consumer = incrementor -> incrementor.addToX(-1);
		
		E.left = N;
		E.right = S;
		E.consumer = incrementor -> incrementor.addToX(1);
	}
	
	public void move(Incrementor incrementor) {
		consumer.accept(incrementor);
	}
	
	public Orientation right() {
		return right;
	}

	public Orientation left() {
		return left;
	}
}
