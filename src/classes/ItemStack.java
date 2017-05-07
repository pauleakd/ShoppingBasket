package classes;

public class ItemStack {
	
	private int quantity;
	private Sellable item;
	private int stackPrice;

	public ItemStack(Sellable item, int quantity){
		this.item = item;
		this.quantity = quantity;
		
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
	
	private void calculateStackPrice(){
		if( item.getStatus2for1() == false || quantity == 1) {
			int result = quantity * item.getPrice();
			setStackPrice(result);
		}
		else if (item.getStatus2for1() == true && quantity > 1 ){
				int price = ((quantity / 2) + (quantity % 2)) * item.getPrice();
					setStackPrice(price);
		}
	}
	
	public int getStackPrice(){
		calculateStackPrice();
		return this.stackPrice;
	}
	
	private void setStackPrice(int price) {
		this.stackPrice = price;
	}
}
