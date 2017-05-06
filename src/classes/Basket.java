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
	
	public ArrayList<Item> getItems(){
		return new ArrayList<Item>(items);
	}

	public void addItem(Item item) {
		if(items.contains(item)){
			updateItemQuantity(item, item.getQuantity() * 2);
		}
		else items.add(item);
	}
	
	public void removeItemFully(Item item){
		items.remove(item);
	}
	
	public void empty(){
		items.clear();
	}

	public void updateItemQuantity(Item item, int newQuantity) {
		for(Item existingItem : items){
			if(existingItem == item){
				existingItem.setQuantity(newQuantity);
			}
		}
		
	}
	
	
	
}
