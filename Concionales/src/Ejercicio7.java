import java.io.PrintStream;
import java.util.Scanner;

public class Ejercicio7 {
	
	private static PrintStream sout = new PrintStream(System.out);
	private static Scanner input = new Scanner(System.in);
	
	/*
	 * Desarrollo un algoritmo que permita determinar si un número es negativo, si es
	 * igual a 0 o bien si es positivo.
	 */
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1;
		
		sout.print("Type a number: ");
		num1 = input.nextInt();
		
		if(num1<0) {
			
			sout.print("The number is negative");
			
		} else if(num1 == 0) {
				
				sout.print("The number is 0");

		}else {
				sout.print("The number is positive");

		}//end else

		
	}

}

