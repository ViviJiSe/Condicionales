import java.io.PrintStream;
import java.util.Scanner;

public class Ejercicio1 {
	
	private static PrintStream sout = new PrintStream(System.out);
	private static Scanner input = new Scanner(System.in);
	
	/*
	 * Desarrollo un algoritmo que permita leer un número entero y determie si es un
	 * número terminado en 4.
	 */
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1;
		
		sout.print("Type a number: ");
		num1 = input.nextInt();
		
		if((num1%10)==4) {
			sout.print("The number ends in 4");
		}//end if

		else {
			sout.print("The number does not end in 4");
		}// end else
		
	}// end main

}// end class
