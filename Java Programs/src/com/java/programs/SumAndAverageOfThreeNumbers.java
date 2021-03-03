package com.java.programs;


import java.util.Scanner;

public class SumAndAverageOfThreeNumbers {

	/** main method which accepts 3 numbers for Sum and avg
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("enter numbers to for sum and avg");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		float sum = num1+num2+num3;
		float avg = (num1+num2+num3)/(float)3;// converting 3 to 3.0f
		System.out.println(sum);
		System.out.println(avg);
		sc.close();
	}

}
  