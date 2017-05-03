package mower.service;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import mower.model.Lawn;
import mower.model.Mower;
import mower.model.Orientation;
import mower.model.Position;

public class MowerMoverTest {
	private MowerMover mowerMover;

	@Before
	public void setUp() {
		mowerMover = new MowerMover();
	}

	@Test
	public void test1() {
		Lawn lawn = new Lawn(5, 5);
		Mower mower = new Mower(new Position(1, 2), Orientation.N);
		
		mowerMover.move(lawn, mower, "LFLFLFLFF");
		assertThat(mower.toString(), is("1 3 N"));
	}
	
	@Test
	public void test2() {
		Lawn lawn = new Lawn(5, 5);
		Mower mower = new Mower(new Position(3, 3), Orientation.E);
		
		mowerMover.move(lawn, mower, "FFRFFRFRRF");
		assertThat(mower.toString(), is("5 1 E"));
	}
	
}
