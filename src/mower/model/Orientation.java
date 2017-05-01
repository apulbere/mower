package mower.model;

public enum Orientation {
	N, S, W, E;

	public static Orientation right(Orientation orientation) {
		switch(orientation) {
			case N: return E;
			case E: return S;
			case S: return W;
			case W: return N;
			default:
				throw new IllegalStateException();
		}

	}

	public static Orientation left(Orientation orientation) {
		switch(orientation) {
			case N: return W;
			case W: return S;
			case S: return E;
			case E: return N;
			default:
				throw new IllegalStateException();
		}
	}
}
