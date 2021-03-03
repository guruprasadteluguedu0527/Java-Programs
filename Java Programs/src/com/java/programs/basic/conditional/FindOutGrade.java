package com.java.programs.basic.conditional;

import java.util.Scanner;

public class FindOutGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Plese enter score between(1-10) only");
		int score = sc.nextInt();
		String grade = "";

		if (score >= 8 && score <= 10) {
			System.out.println("A");
		} else if (score >= 5 && score <= 7) {
			System.out.println("B");
		} else if ((score >= 1 && score <= 4)) {
			System.out.println("C");
		} else
			System.out.println("wrong input, student score, cant be <0 and >10");

		System.out.println("Student score: " + score + " and grade is: " + grade);
		sc.close();
	}

}
