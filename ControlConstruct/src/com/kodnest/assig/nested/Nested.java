package com.kodnest.assig.nested;

import java.util.Scanner;

public class Nested {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Your Age");
		int age=scan.nextInt();
		
		if(age<18)
		{
		System.out.println("You are not Eligible to Work");
		}
		else
		{
		if(age>=18 && age<=60)
		{
		System.out.println("You are Eligible to Work");
		}
		else
		{
		System.out.println("Sorry You are too Old to Work");
		}
		}
	}

}
