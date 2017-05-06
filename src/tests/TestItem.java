package tests;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.Test;

import classes.Item;

public class TestItem {
	Item item1;
	Item item2; 
	Item item3;
	
	@Before
	public void Before() {
		item1 = new Item("Shoes", 4);
		item2 = new Item("Glasses", 10, 2);
		item3 = new Item("Glasses", 10, 3);
	}

	@Test
	public void testItemSetUp() {
		assertEquals(10, item2.getItemPrice());
		assertEquals(1, item1.getQuantity());
	}
	
	@Test 
	public void testFinalPriceCalculation(){
		assertEquals(4, item1.getFinalPrice());
		assertEquals(20, item2.getFinalPrice());
		item3.add2for1Discount();
		assertEquals(20, item3.getFinalPrice());
		item3.remove2for1Discount();
		assertEquals(30, item3.getFinalPrice());
	}

}
