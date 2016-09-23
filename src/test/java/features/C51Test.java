package features;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import features.C51;

public class C51Test {

	private C51 myClassC51;

	@Before
	public void before() {

		myClassC51 = new C51();
	}

	@Test
	public void testM1() {
		assertEquals("m1", myClassC51.m1());
	}

	@Test
	public void testM2() {
		assertEquals("m2", myClassC51.m2());
	}

}
