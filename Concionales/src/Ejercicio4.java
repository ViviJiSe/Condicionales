import java.io.PrintStream;
import java.util.Scanner;

public class Ejercicio4 {
	
	private static PrintStream sout = new PrintStream(System.out);
	private static Scanner input = new Scanner(System.in);
	
	/*
	 * Desarrolle un algoritmo que le permita leer un número entero y determinar si
	 * tiene 3 dígitos.
	 */
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1;
	
		sout.print("Type a number: ");
		num1 = input.nextInt();
		
		if(num1 >99 && num1<1000) {
			sout.print("The number " + num1 + " has three digits");
		}else {
			sout.print("The number " + num1 + " does not have three digits");
		}
		
		

	}

}
