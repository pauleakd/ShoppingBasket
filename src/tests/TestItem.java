package tests;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.Test;

import classes.Item;

public class TestItem {
	Item item2; 
	Item item1;
	
	@Before
	public void Before() {
		item1 = new Item("Shoes", 4);
		item2 = new Item("Glasses", 10, 2);
	}

	@Test
	public void testItemSetUp() {
		assertEquals(10, item2.getItemPrice());
		assertEquals(1, item1.getQuantity());
	}

}
