package javaBasicExercise150;

public class Exercise4 {
	
	/*4. Write a Java program to print the result of the following operations.
	 * Test Data: 
	 * a. -5 + 8 * 6
	 * b. (55+9) % 9
	 * c. 20 + -3*5 / 8
	 * d. 5 + 15 / 3 * 2 - 8 % 3 
	 * Expected Output : 
	 * 43
	 * 1
	 * 19
	 * 13 */

	public static void main(String[] args) {
		int a,b,c,d;
		a = -5 + 8 * 6;
		b = (55+9) % 9;
		c = 20 + -3*5 / 8;
		d = 5 + 15 / 3 * 2 - 8 % 3;
		
		System.out.println("O resultado de 5 + 15 / 3 * 2 - 8 % 3 é: \n"+a);
		System.out.println("O resultado de (55+9) % 9 é: \n"+b);
		System.out.println("O resultado de 20 + -3*5 / 8 é: \n"+c);
		System.out.println("O resultado de 5 + 15 / 3 * 2 - 8 % 3 é: \n"+d);

	}

}
