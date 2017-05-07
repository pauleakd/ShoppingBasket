package tests;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.Test;

import classes.*;

public class TestItem {
	Item item1;
	Item item2; 
	
	@Before
	public void Before() {
		item1 = new Item("Glasses", 5);
		item2 = new Item("Shoes", 15, true);
	}

	@Test
	public void testItemSetUp() {
		assertEquals(5, item1.getPrice());
		assertEquals(15, item2.getPrice());
		assertEquals(false, item1.getStatus2for1());
		assertEquals(true, item2.getStatus2for1());
	}
	

}
