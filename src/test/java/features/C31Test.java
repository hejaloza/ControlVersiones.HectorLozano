package features;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import features.C31;

public class C31Test {

	private C31 myClassC31;

	@Before
	public void before() {

		myClassC31 = new C31();
	}

	@Test
	public void testM1() {
		assertEquals("m1", myClassC31.m1());
	}

	@Test
	public void testM2() {
		assertEquals("m2", myClassC31.m2());
	}

}
