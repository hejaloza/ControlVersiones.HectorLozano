package features;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import features.C52;

public class C52Test {

	private C52 myClassC52;

	@Before
	public void before() {
		myClassC52 = new C52();
	}

	@Test
	public void testMa() {
		assertEquals("mA", myClassC52.mA());
	}

}
