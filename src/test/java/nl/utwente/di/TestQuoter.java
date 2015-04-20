package nl.utwente.di;

import org.junit.*;

public class TestQuoter {

	@Test
	public void testBook1() throws Exception {
		Quoter quoter = new Quoter();
		double price = quoter.getBookPrice("1");
		Assert.assertEquals("Price of Book 1", 10.0, price, 0.0);
	}
}
