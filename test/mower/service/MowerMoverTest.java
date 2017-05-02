package mower.service;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import mower.model.Lawn;
import mower.model.Mower;

public class MowerMoverTest {
	private MowerMover mowerMover;

	@Before
	public void setUp() {
		mowerMover = new MowerMover();
	}

	@Test
	public void test1() {
		Lawn lawn = new Lawn("5 5");
		Mower mower = new Mower("1 2 N");
		
		mowerMover.move(lawn, mower, "LFLFLFLFF");
		assertThat(mower.getFormatedPosition(), is("1 3 N"));
	}
	
	@Test
	public void test2() {
		Lawn lawn = new Lawn("5 5");
		Mower mower = new Mower("3 3 E");
		
		mowerMover.move(lawn, mower, "FFRFFRFRRF");
		assertThat(mower.getFormatedPosition(), is("5 1 E"));
	}
	
	@Test
	public void nextMowerStartsFromPreviousMowerStopPosition() {
		Lawn lawn = new Lawn("2 2");
		Mower first = new Mower("0 0 N");
		
		mowerMover.move(lawn, first, "FF");
		assertThat(first.getFormatedPosition(), is("0 2 N"));
		
		Mower second = new Mower("0 2 E");
		mowerMover.move(lawn, second, "FF");
		assertThat(second.getFormatedPosition(), is("0 2 E"));
	}
	
	@Test
	public void nextMowerEncountersAnObstacle() {
		Lawn lawn = new Lawn("2 2");
		Mower first = new Mower("0 0 N");
		
		mowerMover.move(lawn, first, "F");
		assertThat(first.getFormatedPosition(), is("0 1 N"));
		
		Mower second = new Mower("0 0 N");
		mowerMover.move(lawn, second, "FFRF");
		assertThat(second.getFormatedPosition(), is("1 0 E"));
	}
}
