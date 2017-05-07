package classes;

import java.util.ArrayList;

public class Basket {
	private ArrayList<ItemStack> items;
	private boolean loyaltyCardStatus;
	
	public Basket(boolean status){
		loyaltyCardStatus = status;
		items = new ArrayList<ItemStack>(); 
	}
	
	public Basket(){
		loyaltyCardStatus = false;
		items = new ArrayList<ItemStack>(); 
	}
	
	public int getItemCount(){
		return items.size();
	}
	
	public ArrayList<ItemStack> getItems(){
		return new ArrayList<ItemStack>(items);
	}

//	public void addItem(Item item) {
//		if(items.contains(item)){
//			int existingQuantity = findItemInItems(item).getQuantity();
//			updateItemQuantity(item, (item.getQuantity() + existingQuantity));
//		}
//		else items.add(item);
//	}
//	
//	public void removeItemStack(ItemStack item){
//		items.remove(item);
//	}
	
	public void empty(){
		items.clear();
	}

//	public void updateItemQuantity(Item item, int newQuantity) {
//		for(Item existingItem : items){
//			if(existingItem == item){
//				existingItem.setQuantity(newQuantity);
//			}
//		}
//		
//	}
//	
//	public Item findItemInItems(Item item){
//		for(Item existingItem : items){
//			if(existingItem == item){
//				return existingItem;
//			}
//		}
//		return null;
//	}
	
	
}
