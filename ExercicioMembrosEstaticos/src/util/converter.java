package util;

public class converter {
	
	public static double IOF = 0.06;
	
	public static double dollartoReal(double amount,double dollarPrice) {
		return amount * dollarPrice * (1.0 + IOF);
	}
	
	

}
