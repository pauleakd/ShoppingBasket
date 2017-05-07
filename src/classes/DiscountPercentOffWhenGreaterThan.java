package classes;

public class DiscountPercentOffWhenGreaterThan implements Calculatorable {
	private double amountPercent;
	private double amountGreaterThan;
	
	public DiscountPercentOffWhenGreaterThan(double amountPercent, double amountGreaterThan){
		this.amountPercent = amountPercent;
		this.amountGreaterThan = amountGreaterThan;
	}
	
	@Override
	public double ApplyDiscount(Basket basket, double currentPrice) {
		if (currentPrice > amountGreaterThan){
			double discountedPrice = currentPrice - (currentPrice * amountPercent);
			return discountedPrice;
		}
		else return currentPrice;
	}

}
