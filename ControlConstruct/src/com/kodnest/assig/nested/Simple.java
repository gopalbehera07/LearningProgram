package com.kodnest.assig.nested;
import java.util.Scanner;

public class Simple {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Student Score");
		int score=scan.nextInt();
		if (score>=40)
		{
			System.out.println("You Are Eligible To Join Our College");
		}
		if(score>=80)
		{
			System.out.println("Also You Are Eligible To Scholarship");
		}
	}

}
