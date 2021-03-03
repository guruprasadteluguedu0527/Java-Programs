package com.java.programs;

import java.util.Scanner;

public class CalProfitOrLoss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float bp, sp;
		Scanner sc = new Scanner(System.in);
		
//		Accept buying and selling price
		System.out.println("Enter the buying price");
		bp = sc.nextFloat();
		System.out.println("Enter the selling price");
		sp = sc.nextFloat();

		float amount = sp - bp;
		
		if (amount < 0)
			System.out.println("you made Loss of INR" + " " + amount);
		else if (amount > 0)
			System.out.println("you made profit of INR" + " " + amount);
		else
			System.out.println("No profit No loss");
		sc.close();

	}

}
