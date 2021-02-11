import java.io.PrintStream;
import java.util.Scanner;

public class Ejercicio2 {
	
	private static PrintStream sout = new PrintStream(System.out);
	private static Scanner input = new Scanner(System.in);
	
	/*
	 * Desarrolle un algoritmo que le permita leer un número entero y determine si es
	 * negativo.
	 */
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1;
		
		sout.print("Type a number: ");
		num1 = input.nextInt();
		
		if(num1<0) {
			
			sout.print("The number is negative");
			
		} else 
			sout.print("The number is not negative");

		}//end else


}
