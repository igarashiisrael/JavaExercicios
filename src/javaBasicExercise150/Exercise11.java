package javaBasicExercise150;

import java.util.Scanner;

public class Exercise11 {
	/*11. Write a Java program to print the area and perimeter of a circle.
	 * Test Data: Radius = 7.5
	 * Expected Output Perimeter is = 47.12388980384689
	 * Area is = 176.71458676442586*/

	 public static void main(String[] args){
		    double area, raio, per;
		  
		    Scanner sc = new Scanner(System.in);
		    System.out.print("Informe o raio do círculo: ");
		    raio = Float.parseFloat(sc.nextLine());
		    area = Math.PI * Math.pow(raio, 2);
		    per = 2 * Math.PI * raio;
		    
		    
		    System.out.println("A area do círculo de raio " +
		    raio + " é igual a " + area);
		    System.out.println("O perímetro do circulo de raio " +
		    raio + "é igual a " + per);
		    sc.close();
		    System.exit(0);
		  }
		}