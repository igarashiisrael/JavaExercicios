package javaBasicExercise150;

public class Exercise16 {
	/*16. Write a Java program to print a face.*/

	public static void main(String[] args) {
		
		 System.out.println(" +\"\"\"\"\"+ ");
	        System.out.println("[| o o |]");
	        System.out.println(" |  ^  | ");
	        System.out.println(" | '-' | ");
	        System.out.println(" +-----+ ");
	        
	        System.out.println();
	        System.out.println();
	        
	        //Sample Solution (using array):
	        
	        System.out.println("Same using array");
	        System.out.println();
	        
	        String[] arra = new String[5];

	        arra[0] = " +\"\"\"\"\"+ ";
	        arra[1] = "[| o o |]";
	        arra[2] = " |  ^  |";
	        arra[3] = " | '-' |";
	        arra[4] = " +-----+";

	        for (int i = 0; i < 5; i++) {
	         System.out.println(arra[i]);
	        }
	        
	}

}
