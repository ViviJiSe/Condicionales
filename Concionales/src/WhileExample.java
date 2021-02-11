import java.io.PrintStream;
import java.util.Scanner;

public class WhileExample {
	
	private static PrintStream sout = new PrintStream(System.out);
	private static Scanner input = new Scanner(System.in);
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number =10;
		
		while(number < 21) {
			sout.printf("%s%d \n", "The value is: ",number);
			number++;
					
		}

	}

}
