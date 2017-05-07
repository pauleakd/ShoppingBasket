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
	Calculatorable loyaltycalculator;
	private DiscountPercentOffWhenGreaterThan percentOffGreaterThanCalculator;
	
	@Before
	public void before(){
		item1 = new Item("Shoes", 4);
		item2 = new Item("Glasses", 10);
		item3 = new Item("Glasses", 10);
		stack1 = new ItemStack(item1, 2);
		stack2 = new ItemStack(item2, 1);
		basket = new Basket();
		loyaltycalculator = new LoyaltyCardDiscountCalculator(0.02);
		percentOffGreaterThanCalculator = new DiscountPercentOffWhenGreaterThan(0.1, 20);
		
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
	
	@Test 
	
	public void testStacksPriceCalculation(){
		basket.addStack(stack1);
		basket.addStack(stack2);
		
		assertEquals(18, basket.getStacksPrices());
	}
	
	@Test 
	
	public void testFinalPrice(){
		basket.addCalculator(loyaltycalculator);
		basket.addCalculator(percentOffGreaterThanCalculator);
		basket.addStack(stack1);
		item1.add2for1Discount();
		basket.addStack(stack2);
		basket.addLoyaltyCard();
		assertEquals(13.72, basket.getFinalPrice(), 0.01);
		basket.addStack(stack2);
		assertEquals(21.168, basket.getFinalPrice(), 0.01);
		
	}

} 
