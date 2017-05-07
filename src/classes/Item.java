package classes;

public class Item implements Sellable {
	
	protected int price;
	protected boolean status2for1;
	protected String name;
	
	public Item(String name, int price){
		this.name = name;
		this.price = price;
		this.status2for1 = false;
	}
	
	public Item(String name, int price, boolean status){
		this.name = name;
		this.price = price;
		this.status2for1 = status;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setPrice(int newPrice) {
		this.price = newPrice;
	}
	
	public void setItemPrice(int newPrice) {
		price = newPrice;
	}
	
	public void add2for1Discount(){
		status2for1 = true;
	}
	
	public void remove2for1Discount(){
		status2for1 = false;
	}
	
	public boolean getStatus2for1(){
		return status2for1;
	}
	
	
}
