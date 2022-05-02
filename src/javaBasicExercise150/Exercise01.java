package javaBasicExercise150;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		/* 
		 * 1. Write a Java program to print 'Hello' on screen 
		 * and then print your name on a separate line. Go to the editor
		 * Expected Output :
		 * Hello
		 * Alexandra Abramov
		 */
		String name, lastName;
		Scanner sc = new Scanner (System.in); 
		System.out.print("Digite seu nome: ");
		name = sc.next();
		System.out.print("Digite último nome: ");
		lastName = sc.next();
		System.out.println("Hello\n"+name+" "+lastName);
		
		
		sc.close();

	}

}
