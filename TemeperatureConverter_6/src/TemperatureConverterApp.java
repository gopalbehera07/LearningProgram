import java.util.Scanner;

public class TemperatureConverterApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the temperature in Fahrenheit");
		double fahrenheit=scan.nextDouble();
		TemperatureConverter temperatureConverter=new TemperatureConverter();
		double celcius=temperatureConverter.convertFahrenheitToCelsius(fahrenheit);
		System.out.println(celcius);
	}


}
