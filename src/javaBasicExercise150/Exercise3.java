package javaBasicExercise150;

import java.util.Scanner;

public class Exercise3 {
	
	/*
	 * 3. Write a Java program to divide two numbers and print on the screen.
	 * Test Data : 50/3
	 * Expected Output : 16
	 * */

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n1, n2, d1;
		System.out.println("Entre com o valor inicial: ");
		n1 = sc.nextInt();
		System.out.println("Entre com o número pelo qual quer realizar a divisão: ");
		n2 = sc.nextInt();
		d1 = n1/n2;
		
		System.out.println(n1+" divido por "+ n2+ " é: "+d1);
		sc.close();
	}

}
