package features;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import features.C22;

public class C22Test {

	private C22 myClassC22;

	@Before
	public void before() {

		myClassC22 = new C22();
	}

	@Test
	public void testMA() {
		assertEquals("mA", myClassC22.mA());
	}

}
