import java.io.PrintStream;
import java.util.Scanner;

public class Ejercicio5 {
	
	private static PrintStream sout = new PrintStream(System.out);
	private static Scanner input = new Scanner(System.in);
	
	/*
	 * Desarrolle un algoritmo que permita leer tres valores y almacenarlos en las
	 * variables A, B y C respectivamente. El algoritmo debe determinar cual es el
	 * mayor. 
	 */
	
	public static void main(String[] args) {
		
		int A;
		int B;
		int C;
		
		sout.print("Type a number: ");
		A = input.nextInt();
		
		sout.print("Type another number: ");
		B = input.nextInt();
		
		sout.print("Type a number: ");
		C = input.nextInt();
		
		if(A>B && A>C) {
			sout.print(A + " is the biggest number");
		}else if(B>C) {
			sout.print(B + " is the bigest number");
		}else {
			sout.print(C + " is the biggest number");
		}
		
	}

}
