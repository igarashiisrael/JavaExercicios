package javaBasicExercise150;

import java.util.Scanner;

public class Exercise12 {
	/*12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.*/

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n1, n2, n3, sum;
		double ave;
		
		System.out.println("Input first number: ");
		n1 = sc.nextInt();
		System.out.println("Input second number: ");
		n2 = sc.nextInt();
		System.out.println("Input thirt number: ");
		n3 = sc.nextInt();
		
		sum = n1+n2+n3;
		ave = sum /3;
		
		System.out.println("The average of the numbers "+ n1 + ", " + n2 + " and " + n3 + " is: " + ave);
		
		
		sc.close();

	}

}
