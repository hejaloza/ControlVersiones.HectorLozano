package features;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import features.C12;

public class C12Test {

	private C12 myClassC12;

	@Before
	public void before() {

		myClassC12 = new C12();
	}

	@Test
	public void testMa() {
		assertEquals("mA", myClassC12.mA());
	}

}
