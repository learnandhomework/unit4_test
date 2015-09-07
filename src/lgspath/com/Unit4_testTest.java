package lgspath.com;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Unit4_testTest {
	private static Unit4_test unit4_test = new Unit4_test();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		unit4_test.For();
		assertEquals(unit4_test.Number(), unit4_test.getResult());
	}

}
