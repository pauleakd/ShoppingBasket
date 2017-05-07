package tests;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import classes.Basket;
import classes.Calculatorable;
import classes.Item;
import classes.ItemStack;
import classes.LoyaltyCardDiscountCalculator;

public class TestCalculatorable {
		Item item1;
		Item item2;
		Item item3;
		ItemStack stack1;
		ItemStack stack2;
		Basket basket;
		Calculatorable loyaltycalculator;
		
		@Before
		public void Before(){
			item1 = new Item("Shoes", 4);
			item2 = new Item("Glasses", 10);
			item3 = new Item("Glasses", 10);
			stack1 = new ItemStack(item1, 2);
			stack2 = new ItemStack(item2, 1);
			basket = new Basket();
			loyaltycalculator = new LoyaltyCardDiscountCalculator(0.02);
		}
		
		@Test 
		public void TestLoyaltyCard(){
			basket.addStack(stack1);
			basket.addLoyaltyCard();
			double discountedPrice = loyaltycalculator.ApplyDiscount(basket);
			assertEquals(7.84, discountedPrice, 0.01);
		}
	}

