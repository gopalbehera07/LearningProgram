package TaxCalculator;
import java.util.Scanner;
public class TaxCalcu {
	  public static double calculateTotalWithTax(double purchaseAmount, double taxRate) {
	        double taxAmount = purchaseAmount * taxRate;
	        double totalCost = purchaseAmount + taxAmount;
	        return totalCost;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the purchase amount: ");
	        double purchaseAmount = scanner.nextDouble();

	        System.out.print("Enter the tax rate (in decimal form): ");
	        double taxRate = scanner.nextDouble();

	        double totalCost = calculateTotalWithTax(purchaseAmount, taxRate);
	        System.out.println("Total cost including tax: " + totalCost);

	        scanner.close();
	    }
}
