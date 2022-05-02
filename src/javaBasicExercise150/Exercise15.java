package javaBasicExercise150;

import java.util.Scanner;

public class Exercise15 {
	
	/*15. Write a Java program to swap two variables*/

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a, b, temp;
		
		System.out.println("Input the first number 'a': ");
		a = sc.nextInt();
		System.out.println("Input the second number 'b': ");
		b = sc.nextInt();
		
		System.out.println("Before swapping: a = "+ a + " and b = "+ b);
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("After swapping: a = "+ a + " and b = "+ b);
		
		sc.close();
		System.exit(0);

	}

}
