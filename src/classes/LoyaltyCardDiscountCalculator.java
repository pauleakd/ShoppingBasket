package classes;

import java.math.BigDecimal;

public class LoyaltyCardDiscountCalculator implements Calculatorable {

	private double amount;
	
	public LoyaltyCardDiscountCalculator(double percentDiscount){
		amount = percentDiscount;
	}
	@Override
	public double ApplyDiscount(Basket basket, double currentPrice) {
		if (basket.getLoyaltyCardStatus() == true){
			double amountAfterDiscount = currentPrice - (currentPrice * amount);
			return amountAfterDiscount;
		}
		else return currentPrice;
	}

}
