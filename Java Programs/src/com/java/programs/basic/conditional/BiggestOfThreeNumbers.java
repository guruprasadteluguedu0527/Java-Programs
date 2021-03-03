package com.java.programs.basic.conditional;

import java.util.Scanner;

public class BiggestOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter num 1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the num 2: ");
		int num2 = sc.nextInt();
		System.out.println("Enter the num 2: ");
		int num3 = sc.nextInt();

		int big;
		/*
		 * for 2 numbers if (num1 > num2) { System.out.println("The biggest number is: "
		 * + num1); } else { System.out.println("The biggest number is " + num2); }
		 */

		// for 3 numbers
		if(num1 == num2 && num2 == num3) {
			System.out.println("All numbers are equal");
			sc.close();
			return;
			
		}
		if (num1 > num2 && num2 > num3) {
			big = num1; 
		} else if (num2 > num3) {
			big = num2;
		} else {
			big = num3;
		}
		System.out.println("The biggest number of 3 numbers "+num1+" "+num2+" "+num3+" is " +big );
		
	}
}
