package com.java.programs.basic.conditional;

import java.util.Scanner;

public class BiggestOfnumbersUsingTernaryOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter num 1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the num 2: ");
		int num2 = sc.nextInt();
		System.out.println("Enter the num 2: ");
		int num3 = sc.nextInt();

		int big = (num1 > num2) ? num1 : num2;
		System.out.println("the biggest of 2 numbers is" + big);

		int big1 = (num1 > num2 && num2 > num3) ? num1 : (num2 > num3) ? num2 : num3;

		System.out.println("The biggest number of 3 numbers " + num1 + " " + num2 + " " + num3 + " is " + big1);

	}

}
