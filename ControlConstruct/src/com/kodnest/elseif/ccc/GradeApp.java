package com.kodnest.elseif.ccc;

import java.util.Scanner;

public class GradeApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Your Score");
		int score=scan.nextInt();
		Grade s1=new Grade();
		s1.giveGrade(score);
		
	}


}
