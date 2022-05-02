package javaBasicExercise150;

import java.util.Scanner;

public class Exercise18 {
	/*18. Write a Java program to multiply two binary numbers. Go to the editor
	 * Input Data: 
	 * Input the first binary number: 10
	 * Input the second binary number: 11
	 * Expected Output
	 * Product of two binary numbers: 110 */

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String bn1, bn2;

		System.out.println("Enter The First Binary No: ");
		bn1 = sc.nextLine();

		System.out.println("Enter The Second Binary No: ");
		bn2 = sc.nextLine();

		int n1 =Integer.parseInt(bn1, 2);
		int n2 =Integer.parseInt(bn2, 2);
		int n3 = n1 * n2;

		System.out.println("The Addition Of 2 Binary No is : " + Integer.toBinaryString(n3));
		
		sc.close();

	}

}
