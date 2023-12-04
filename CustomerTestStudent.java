import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CustomerTestStudent {
	Customer customerOne, customerTwo;

	@Before
	public void setUp() throws Exception {
		customerOne = new Customer("Cust1", 10);
		customerTwo = new Customer("Cust2", 20);
	}

	@After
	public void tearDown() throws Exception {
		customerOne = customerTwo = null;
	}

	@Test
	public void testGetAge() {
		assertTrue(customerOne.getAge() == 10);
		assertFalse(customerOne.getAge() == 9);;
	}
	
	public void testGetName() {
		assertTrue(customerOne.getName().equals("Cust1"));
		assertFalse(customerOne.getName().equals("Cust2"));
	}
}