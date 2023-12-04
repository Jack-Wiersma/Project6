import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AlcoholTestStudent {
	Alcohol alcoholOne, alcoholTwo, alcoholThree, alcoholFour;

	@Before
	public void setUp() throws Exception {
		alcoholOne = new Alcohol("Alc1", Size.SMALL, false);
		alcoholTwo = new Alcohol("Alc2", Size.MEDIUM, true);
		alcoholThree = new Alcohol("Alc3", Size.LARGE, true);
		alcoholFour = new Alcohol("Alc1", Size.SMALL, false);
	}

	@After
	public void tearDown() throws Exception {
		alcoholOne = alcoholTwo = alcoholThree = alcoholFour = null;
	}

	@Test
	public void testCalcPrice() {
		assertEquals(alcoholOne.calcPrice(), 2, 0.1);
		assertEquals(alcoholTwo.calcPrice(), 3.6, 0.1);
		assertEquals(alcoholThree.calcPrice(), 4.6, 0.1);
	}
	
	@Test
	public void testEquals() {
		assertFalse(alcoholOne.equals(alcoholTwo));
		assertFalse(alcoholTwo.equals(alcoholOne));
		assertTrue(alcoholOne.equals(alcoholFour));
	}
}