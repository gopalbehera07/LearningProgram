package TemperatureConversion;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Temperature Conversion Tool!");
        
        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Exit");
            
            int choice = scanner.nextInt();
            
            if (choice == 1) {
                System.out.print("Enter temperature in Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = celsiusToFahrenheit(celsius);
                System.out.println("Temperature in Fahrenheit: " + fahrenheit);
            } else if (choice == 2) {
                System.out.print("Enter temperature in Fahrenheit: ");
                double fahrenheit = scanner.nextDouble();
                double celsius = fahrenheitToCelsius(fahrenheit);
                System.out.println("Temperature in Celsius: " + celsius);
            } else if (choice == 3) {
                System.out.println("Exiting the Temperature Conversion Tool. Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Please select a valid option.");
            }
        }
        
        scanner.close();
    }
    
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
    
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

}
