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
	
	public void addToQuantity(int quantity){
		this.quantity += quantity;
	}
	
	public void add2for1Discount(){
		status2for1 = true;
	}
	
	public void remove2for1Discount(){
		status2for1 = false;
	}
	
	private void setFinalPrice(int price) {
		this.finalPrice = price;
	}
	
	private void calculateFinalPrice(){
		if( status2for1 == false || quantity == 1) {
			int result = quantity * itemPrice;
			setFinalPrice(result);
		}
		else if (status2for1 == true && quantity > 1 ){
				int price = ((quantity / 2) + (quantity % 2)) * itemPrice;
					setFinalPrice(price);
		}
	}
	
	public int getFinalPrice(){
		calculateFinalPrice();
		return this.finalPrice;
	}
}
