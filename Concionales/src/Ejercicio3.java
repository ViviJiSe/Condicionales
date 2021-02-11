import java.io.PrintStream;
import java.util.Scanner;

public class Ejercicio3 {

	private static PrintStream sout = new PrintStream(System.out);
	private static Scanner input = new Scanner(System.in);
	
	
	/*
	 * Desarrolle un algoritmo que le permita leer dos números entero y muestre la 
	 * división del primer número entre el segundo. Recordar que la divisón entre 0 da un error.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1;
		int num2;
		
		sout.print("Type a number: ");
		num1 = input.nextInt();
		
		sout.print("Type a number diferent than 0: ");
		num2 = input.nextInt();
		
		if(num2 == 0) {
			sout.print("You cannot divide a number by 0");
		} else {
			sout.print("The result of: "+ num1 +" / "+ num2 +" is " + num1/num2);
		}
		
		

	}

}
