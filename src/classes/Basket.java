package classes;

import java.util.ArrayList;

public class Basket {
	private ArrayList<Item> items;
	private boolean loyaltyCardStatus;
	
	public Basket(boolean status){
		loyaltyCardStatus = status;
		items = new ArrayList<Item>(); 
	}
	
	public Basket(){
		loyaltyCardStatus = false;
		items = new ArrayList<Item>(); 
	}
	
	public int getItemCount(){
		return items.size();
	}

	public void addItem(Item item) {
		items.add(item);
	}
	
	public void removeItem(Item item){
		items.remove(item);
	}
	
	public void empty(){
		items.clear();
	}
	
	
	
}
