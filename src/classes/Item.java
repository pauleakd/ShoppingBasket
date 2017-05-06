package classes;

public class Item {
	
	private String name;
	private int itemPrice;
	private int finalPrice;
	private int quantity;
	private boolean status2for1;
	
	public Item(String name, int price){
		this.quantity = 1;
		this.name = name;
		this.itemPrice = price;
		status2for1 = false;
	}
	
	public Item(String name, int price, int quantity){
		this.quantity = quantity;
		this.name = name;
		this.itemPrice = price;
		status2for1 = false;
	}
	
	public int getItemPrice() {
		return this.itemPrice;
	}
	
	public void setItemPrice(int price) {
		this.itemPrice = price;
	}
	
	public int getQuantity(){
		return this.quantity;
	}
	
	public void setQuantity(int quantity){
		this.quantity = quantity;
	}
	
	public void add2for1Discount(){
		status2for1 = true;
	}
	
	public void remove2for1Discount(){
		status2for1 = false;
	}
	
	private void setFinalPrice(int price) {
		this.itemPrice = price;
	}
	
//	private void calculateFinalPrice(){
//		if( status2for1==false) {
//			int result = quantity * itemPrice;
//			setFinalPrice(result);
//		}
//		else if (status2for1 == true ){
//			if (quantity/2 == 0){
//				TODO
//			}
//		}
//	}
	
	public int getFinalPrice(){
//		calculateFinalPrice();
		return this.finalPrice;
	}
}
