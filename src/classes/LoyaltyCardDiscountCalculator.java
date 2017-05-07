package classes;

import java.math.BigDecimal;

public class LoyaltyCardDiscountCalculator implements Calculatorable {

	private double amount;
	
	public LoyaltyCardDiscountCalculator(double percentDiscount){
		amount = percentDiscount;
	}
	@Override
	public double ApplyDiscount(Basket basket) {
		if (basket.getLoyaltyCardStatus() == true){
			double amountAfterDiscount = basket.getStacksPrices() - (basket.getStacksPrices() * amount);
			return amountAfterDiscount;
		}
		else return basket.getStacksPrices();
	}

}
