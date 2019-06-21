import java.math.*;

public class BigMath {
	public static void main(String[] args) {
		BigDecimal quantity = new BigDecimal("10");
		BigDecimal unitPrice = new BigDecimal("2.69");
		BigDecimal discountRate = new BigDecimal(".20");
		BigDecimal taxRate = new BigDecimal(".0825");
		
		BigDecimal amount = quantity.multiply(unitPrice);
		BigDecimal discount = amount.multiply(discountRate);
		BigDecimal subtotal = amount.subtract(discount);
		BigDecimal tax = subtotal.multiply(taxRate);
		BigDecimal total = subtotal.add(tax);
		total = total.setScale(2, RoundingMode.HALF_EVEN);

		System.out.println(total);
		//System.out.printf("%.2f\n", total);
		
		
		BigInteger number = new BigInteger("1");
		for (int n = 1; n <= 50; n++)
			number = number.multiply(BigInteger.valueOf(n));
		System.out.println(number);
	}
}