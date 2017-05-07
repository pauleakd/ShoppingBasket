package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.Item;
import classes.ItemStack;

public class TestItemStack {

	@Test
	public void test() {
		Item item1 = new Item("Shoes", 15, true);
		ItemStack stack = new ItemStack(item1, 2);
		
		assertEquals(15, stack.getStackPrice());
		
		item1.remove2for1Discount();
		assertEquals(30, stack.getStackPrice());
		stack.setQuantity(10);
		assertEquals(150, stack.getStackPrice());
		
		item1.add2for1Discount();
		assertEquals(75, stack.getStackPrice());	
	}
	

}
