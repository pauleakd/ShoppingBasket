package classes;

import java.util.ArrayList;

public class Basket {
	private ArrayList<ItemStack> stacks;
	private boolean loyaltyCardStatus;
	
	public Basket(boolean status){
		loyaltyCardStatus = status;
		stacks = new ArrayList<ItemStack>(); 
	}
	
	public Basket(){
		loyaltyCardStatus = false;
		stacks = new ArrayList<ItemStack>(); 
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
	
	
}
