package javaBasicExercise150;

import java.util.Scanner;

public class Exercise07 {
	
	/*7. Write a Java program that takes a number as input and prints its multiplication table upto 10.
	 * Test Data:Input a number: 8
	 * Expected Output : 8 x 1 = 8
	 * 8 x 2 = 16
	 * 8 x 3 = 24
	 * ...
	 * 8 x 10 = 80*/

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n1, n2;
		
		System.out.print("Input a number: ");
		n1 = sc.nextInt();
		
		for(int i=1; i < 11; i++) {
			
		n2 = n1*i;	
		System.out.println(n1+" x "+i+" é: "+n2);
			
		}
		sc.close();
	}

}
