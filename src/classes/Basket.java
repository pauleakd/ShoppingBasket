package classes;

import java.util.ArrayList;

public class Basket {
	private ArrayList<ItemStack> stacks;
	private boolean loyaltyCardStatus;
	private int stacksPrice;
	private ArrayList<Calculatorable> discountCalculators;
	private double finalPrice;
	
	public Basket(boolean status){
		loyaltyCardStatus = status;
		stacks = new ArrayList<ItemStack>(); 
	}
	
	public Basket(){
		loyaltyCardStatus = false;
		stacks = new ArrayList<ItemStack>(); 
		this.discountCalculators = new ArrayList<Calculatorable>();
	}
	
	public Basket(ArrayList<Calculatorable> discountCalculators){
		loyaltyCardStatus = false;
		stacks = new ArrayList<ItemStack>(); 
		this.discountCalculators = discountCalculators;
	}
	
	public int getStackCount(){
		return stacks.size();
	}
	
	public ArrayList<ItemStack> getItems(){
		return new ArrayList<ItemStack>(stacks);
	}

	public void addStack(ItemStack stack) {
		 stacks.add(stack);
	}
	
	public void removeItemStack(ItemStack item){
		stacks.remove(item);
	}
	
	public void empty(){
		stacks.clear();
	}
	
	private void setStacksPrice(int newPrice){
		this.stacksPrice = newPrice;
	}
	
	public void calculateStackPrice(){
		int stacksPrice = 0;
		for(ItemStack stack :stacks){
			stacksPrice += stack.getStackPrice();
		}
		setStacksPrice(stacksPrice);
	}
	
	public int getStacksPrices(){
		calculateStackPrice();
		return this.stacksPrice;
	}

	public boolean getLoyaltyCardStatus() {
		return loyaltyCardStatus;
	}
	
	public void addLoyaltyCard(){
		this.loyaltyCardStatus = true;
	}
	
	public void removeLoyaltyCard(){
		this.loyaltyCardStatus = false;
	}
	
	public void ApplyAllDiscounts(){
		double priceAfterDiscount = getStacksPrices();
		for(Calculatorable calculator : discountCalculators) {
			double newPrice = calculator.ApplyDiscount(this, priceAfterDiscount);
			priceAfterDiscount = newPrice;
		}
		
		finalPrice = priceAfterDiscount;
	}
	
	public double getFinalPrice(){
		ApplyAllDiscounts();
		return finalPrice;
	}
	
	public void addCalculator(Calculatorable calculator){
		discountCalculators.add(calculator);
	}
	
}
