package com.java.programs.basic.conditional;

import java.util.Scanner;

public class PrintNumberDivBy3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter lower bound: ");
		int lb = sc.nextInt();
		System.out.println("Enter lower bound : ");
		int ub = sc.nextInt();
		
		for(int i=lb;i<=ub;i++) {
			if(i%3==02)
			System.out.println(i);
		}
			
	}

}
