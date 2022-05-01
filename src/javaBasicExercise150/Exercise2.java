package javaBasicExercise150;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		/*
		 * 2.Write a Java program to print the sum of two numbers. 
		 * Go to the editor
		 * Test Data:74 + 36
		 * Expected Output :110 */
		Scanner sc = new Scanner (System.in);
		int n1, n2, som1;
		
		System.out.println("Entre com o primeiro número: ");
		n1 = sc.nextInt();
		System.out.println("Entre com o segundo número: ");
		n2 = sc.nextInt();
		som1 = n1+n2;
		
		System.out.println("A soma dos números "+n1+" e "+n2+" é: "+som1 );
		
		sc.close();
		
	}

}
