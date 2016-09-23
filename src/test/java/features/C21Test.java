package features;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import features.C21;

public class C21Test {

	private C21 myClassC21;

	@Before
	public void before() {

		myClassC21 = new C21();
	}

	@Test
	public void testM1() {
		assertEquals("m1", myClassC21.m1());
	}

	@Test
	public void testM2() {
		assertEquals("m2", myClassC21.m2());
	}

}
