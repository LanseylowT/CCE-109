// Imports
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double finalPrice = 0.0;
        int originalPrice, markedUpPrice, sellingPrice = 0, taxRate;
        
        // Getting Inputs
        System.out.print("Enter original price: ");
        originalPrice = input.nextInt();
        System.out.print("Enter price of the marked up price: ");
        markedUpPrice = input.nextInt();
        System.out.print("Enter sales tax rates: ");
        taxRate = input.nextInt();
        
        // Calculations
        
        
        // Printing/Output
        System.out.println("Original Price: " + originalPrice);
        System.out.println("Marked up Percentage: " + markedUpPrice);
        System.out.println("Selling Price: " + sellingPrice);
        System.out.println("Tax Rate: " + taxRate);
        System.out.println("Final Price: " + finalPrice);
    }
    
}
