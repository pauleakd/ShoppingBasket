package tests;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import classes.Basket;
import classes.Calculatorable;
import classes.DiscountPercentOffWhenGreaterThan;
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
		private DiscountPercentOffWhenGreaterThan percentOffGreaterThanCalculator;
		
		@Before
		public void Before(){
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
		public void TestLoyaltyCard(){
			basket.addStack(stack1);
			basket.addLoyaltyCard();
			double discountedPrice = loyaltycalculator.ApplyDiscount(basket, basket.getStacksPrices());
			assertEquals(7.84, discountedPrice, 0.01);
			basket.removeLoyaltyCard();
			double discountedPrice2 = loyaltycalculator.ApplyDiscount(basket, basket.getStacksPrices());
			assertEquals(8.0, discountedPrice2, 0.01);
		}
		
		@Test 
		
		public void TestPercentOffCalculatorTrue(){
			basket.addStack(stack1);
			basket.addStack(stack2);
			basket.addStack(stack2);
			double discountedPrice = percentOffGreaterThanCalculator.ApplyDiscount(basket, basket.getStacksPrices());
			assertEquals(25.2, discountedPrice, 0.01);
			basket.removeItemStack(stack2);
			double discountedPrice2 = percentOffGreaterThanCalculator.ApplyDiscount(basket, basket.getStacksPrices());
			assertEquals(18.0, discountedPrice2, 0.01);
		}
	}

