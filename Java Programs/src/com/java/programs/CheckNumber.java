package com.java.programs;

import java.util.Scanner;

public class CheckNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Accept input from the user if input entered is -ve convert nt to +ve and
		// display the same.
		System.out.println("enter any number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num < 0)
			num = -num;
		System.out.println(num);
		sc.close();

	}

}
