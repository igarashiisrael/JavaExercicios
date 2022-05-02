package javaBasicExercise150;

import java.util.Scanner;

public class Exercise06 {
	
	/*6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
	 * Test Data:Input first number: 125
	 * Input second number: 24
	 * Expected Output :125 + 24 = 149
	 * 125 - 24 = 101
	 * 125 x 24 = 3000
	 * 125 / 24 = 5
	 * 125 mod 24 = 5*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, sum, multi, sub, div, remainder;
		System.out.println("Input first number: ");
		n1 = sc.nextInt();
		System.out.println("Input second number: ");
		n2 = sc.nextInt();
		
		sum = n1+n2;
		multi = n1*n2;
		sub = n1-n2;
		div = n1/n2;
		remainder = n1 % n2;
		
		System.out.println(n1+" + "+n2+" = "+ sum);
		System.out.println(n1+" - "+n2+" = "+ sub);
		System.out.println(n1+" * "+n2+" = "+ multi);
		System.out.println(n1+" / "+n2+" = "+ div);
		System.out.println(n1+" % "+n2+" = "+ remainder);
		
		sc.close();

	}

}
