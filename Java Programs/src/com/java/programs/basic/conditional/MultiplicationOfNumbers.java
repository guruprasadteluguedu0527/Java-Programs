package com.java.programs.basic.conditional;

import java.util.Scanner;

public class MultiplicationOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter num for multplication table: ");
		int num = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
System.out.println("   ");
		for (int i = 10; i >= 1; i--) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
	}

}
