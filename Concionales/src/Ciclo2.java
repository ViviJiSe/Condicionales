import java.io.PrintStream;
import java.util.Scanner;

public class Ciclo2 {
	
	private static PrintStream sout = new PrintStream(System.out);
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number =0;
		int sum = 0;
		
		while(number <10) {
			sum= sum + number;
			number++;
			
			sout.printf("%s%d \n", "The number is: ", number);
					
		}
		
		sout.printf("The value is: %d ",sum);
		
	}

}
