import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SmoothieTestStudent {
	Smoothie smoothieOne, smoothieTwo, smoothieThree, smoothieFour;

	@Before
	public void setUp() throws Exception {
		smoothieOne = new Smoothie("Strawberry", Size.SMALL, 1, false);
		smoothieTwo = new Smoothie("Blueberry", Size.MEDIUM, 2, false);
		smoothieThree = new Smoothie("Bannana", Size.LARGE, 3, true);
		smoothieFour = new Smoothie("Strawberry", Size.SMALL, 1, false);
	}

	@After
	public void tearDown() throws Exception {
		smoothieOne = smoothieTwo = smoothieThree = smoothieFour = null;
	}

	@Test
	public void testGetNumOfFruits() {
		assertEquals(1, smoothieOne.getNumOfFruits());
		assertEquals(2, smoothieTwo.getNumOfFruits());
		assertEquals(3, smoothieThree.getNumOfFruits());
	}

	@Test
	public void testGetAddProtein() {
		assertEquals(false, smoothieOne.getAddProtein());
		assertEquals(false, smoothieTwo.getAddProtein());
		assertEquals(true, smoothieThree.getAddProtein());
	}

	@Test
	public void testCalcPrice() {
		assertEquals(smoothieOne.calcPrice(), 2.5, 0.1);
		assertEquals(smoothieTwo.calcPrice(), 4, 0.1);
		assertEquals(smoothieThree.calcPrice(), 7, 0.1);
	}
	
	@Test
	public void testEquals() {
		assertFalse(smoothieOne.equals(smoothieTwo));
		assertFalse(smoothieTwo.equals(smoothieOne));
		assertTrue(smoothieOne.equals(smoothieFour));
	}
}