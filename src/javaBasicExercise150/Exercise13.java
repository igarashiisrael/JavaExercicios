package javaBasicExercise150;

import java.util.Scanner;

public class Exercise13 {
	
	/*13. Write a Java program to print the area and perimeter of a rectangle.
	 * Test Data: Width = 5.5 Height = 8.5
	 * Expected Output: Area is 5.6 * 8.5 = 47.60
	 * Perimeter is 2 * (5.6 + 8.5) = 28.20*/

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double width, height, area, perimeter;
		
		System.out.println("Input the Width: ");
		width = sc.nextDouble();
		System.out.println("Input the Height: ");
		height = sc.nextDouble();
		area = width * height;
		perimeter = 2 * (width + height);
		
		System.out.println("The area of the rectangle is: "+ area);
		System.out.println("The perimeter of the rectangle is: "+ perimeter);
		sc.close();
		System.exit(0);

	}

}
