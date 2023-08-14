package com.kodnest.assig.nested;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your Age");
		int age=scan.nextInt();
		System.out.println("Enter Your Weight");
		int weight=scan.nextInt();
		if(age>=18)
		{
		if(weight>=60)
		{
		System.out.println("You Are Eligible To Donate Blood");
		}
		else
		{
		System.out.println("You Are Not Eligible To Donate Blood");
		}
		}
		else
		{
		System.out.println("Age Must be Above 18");
		}
		
	}

}
