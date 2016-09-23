package features;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import features.C32;

public class C32Test {

	private C32 myClassC32;

	@Before
	public void before() {

		myClassC32 = new C32();
	}

	@Test
	public void testMa() {
		assertEquals("mA", myClassC32.mA());
	}

}
