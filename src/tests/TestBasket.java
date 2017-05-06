package tests;

import static org.junit.Assert.*;
import org.junit.*;

import classes.*;

public class TestBasket {
	Item item1;
	Item item2;
	Item item3;
	Basket basket;
	@Before
	public void before(){
		item1 = new Item("Shoes", 4);
		item2 = new Item("Glasses", 10, 2);
		item3 = new Item("Glasses", 10, 3);
		basket = new Basket();
	}

	@Test
	public void testSetUp() {
		basket.addItem(item1);
		basket.addItem(item2);
		assertEquals(2, basket.getItemCount());
		basket.removeItem(item2);
		assertEquals(1, basket.getItemCount());
		basket.empty();
		assertEquals(0, basket.getItemCount());
	}

}