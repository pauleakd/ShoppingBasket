package classes;

import java.math.BigDecimal;

public interface Sellable {
	
	public int getPrice();
	
	public void setPrice(int price);
	
	public void add2for1Discount();
	
	public void remove2for1Discount();
	
	public boolean getStatus2for1();
	
	public String getName();
}
