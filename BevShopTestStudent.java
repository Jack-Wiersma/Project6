import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BevShopTestStudent {
	BevShop obj;

	@Before
	public void setUp() throws Exception {
		obj = new BevShop();
	}

	@After
	public void tearDown() throws Exception {
		obj = null;
	}

	@Test
	public void testIsValidTime() {
		assertTrue(obj.isValidTime(10));
		assertFalse(obj.isValidTime(24));
	}
	
	@Test
	public void testIsMaxFruit() {
		assertTrue(obj.isMaxFruit(5));
		assertTrue(obj.isMaxFruit(6));
	}
}