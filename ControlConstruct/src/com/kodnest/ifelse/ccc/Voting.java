package com.kodnest.ifelse.ccc;

import java.util.Scanner;

public class Voting {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Eenter Age");
		int age=scan.nextInt();
		if (age>=18)
		{
			System.out.println("You Are Eligible For Voting");
		}
		else
		{
			System.out.println("You Are Not Eligible For Voting");
		}
		
	}

}
