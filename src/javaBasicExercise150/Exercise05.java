package javaBasicExercise150;

import java.util.Scanner;

public class Exercise05 {

	/*
	 * 5. Write a Java program that takes two numbers as input and display the
	 * product of two numbers. Test Data: Input first number: 25 Input second
	 * number: 5 Expected Output : 25 x 5 = 125
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, p1;
		System.out.println("Input first number: ");
		n1 = sc.nextInt();
		System.out.println("Input second number: ");
		n2 = sc.nextInt();
		p1 = n1 * n2;
		System.out.println("The product is: " + p1);

		sc.close();

	}

}
