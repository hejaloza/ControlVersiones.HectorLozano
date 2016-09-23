package features;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import features.C11;

public class C11Test {

	private C11 myClassC11;

	@Before
	public void before() {

		myClassC11 = new C11();
	}

	@Test
	public void testM1() {
		assertEquals("m1", myClassC11.m1());
	}

	@Test
	public void testM2() {
		assertEquals("m2", myClassC11.m2());
	}

}
