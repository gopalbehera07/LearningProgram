import java.util.Scanner;

public class Party {
public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number");
		int marks=scan.nextInt();
		System.out.println("Welcome TO Kodnest");
		Check check=new Check();
		check.checkEligibility(marks);
		}
	
}

