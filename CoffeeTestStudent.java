import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CoffeeTestStudent {
	Coffee coffeeOne, coffeeTwo, coffeeThree, coffeeFour;

	@Before
	public void setUp() throws Exception {
		coffeeOne = new Coffee("Chai", Size.SMALL, false, false);
		coffeeTwo = new Coffee("Irish", Size.MEDIUM, true, false);
		coffeeThree = new Coffee("English", Size.LARGE, true, true);
		coffeeFour = new Coffee("Chai", Size.SMALL, false, false);
	}

	@After
	public void tearDown() throws Exception {
		coffeeOne = coffeeTwo = coffeeThree = coffeeFour = null;
	}

	@Test
	public void testGetExtraShot() {
		assertFalse(coffeeOne.getExtraShot());
		assertTrue(coffeeTwo.getExtraShot());
		assertTrue(coffeeThree.getExtraShot());
	}

	@Test
	public void testGetExtraSyrup() {
		assertFalse(coffeeOne.getExtraSyrup());
		assertFalse(coffeeTwo.getExtraSyrup());
		assertTrue(coffeeThree.getExtraSyrup());
	}

	@Test
	public void testCalcPrice() {
		assertEquals(coffeeOne.calcPrice(), 2, 0.1);
		assertEquals(coffeeTwo.calcPrice(), 3.5, 0.1);
		assertEquals(coffeeThree.calcPrice(), 5, 0.1);
	}
	
	@Test
	public void testEquals() {
		assertFalse(coffeeOne.equals(coffeeTwo));
		assertFalse(coffeeTwo.equals(coffeeOne));
		assertTrue(coffeeOne.equals(coffeeFour));
	}

}
