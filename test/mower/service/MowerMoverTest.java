package mower.service;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import mower.model.Lawn;
import mower.model.Mower;

public class MowerMoverTest {
	private Lawn lawn;
	private Mower mower;
	private MowerMover mowerMover;

	@Before
	public void setUp() {
		mowerMover = new MowerMover();
	}

	@Test
	public void test1() {
		lawn = new Lawn("5 5");
		mower = new Mower("1 2 N");
		
		mowerMover.move(lawn, mower, "LFLFLFLFF");
		assertThat(mower.getPosition(), is("1 3 N"));
	}
	
	@Test
	public void test2() {
		lawn = new Lawn("5 5");
		mower = new Mower("3 3 E");
		
		mowerMover.move(lawn, mower, "FFRFFRFRRF");
		assertThat(mower.getPosition(), is("5 1 E"));
	}
}
