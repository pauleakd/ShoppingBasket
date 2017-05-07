package tests;

import static org.junit.Assert.*;
import org.junit.*;

import classes.*;

public class TestBasket {
	Item item1;
	Item item2;
	Item item3;
	ItemStack stack1;
	ItemStack stack2;
	Basket basket;
	
	@Before
	public void before(){
		item1 = new Item("Shoes", 4);
		item2 = new Item("Glasses", 10);
		item3 = new Item("Glasses", 10);
		stack1 = new ItemStack(item1, 2);
		stack2 = new ItemStack(item2, 1);
		basket = new Basket();
	}

	@Test
	public void testSetUp() {
		basket.addStack(stack1);
		assertEquals(1, basket.getStackCount());
		basket.removeItemStack(stack1);
		assertEquals(0, basket.getStackCount());
		basket.addStack(stack2);
		basket.empty();
		assertEquals(0, basket.getStackCount());
	}

} 
