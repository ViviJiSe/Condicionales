import java.io.PrintStream;
import java.util.Scanner;

public class Ejercicio6 {
	
	private static PrintStream sout = new PrintStream(System.out);
	private static Scanner input = new Scanner(System.in);
	
	
	/*
	 * Desarrollo un algoritmo que permita determinar si un estudiante, aprueba el
	 * curso, tiene que ir a convocatoria o definitivamente no paso el curso. La nota
	 * mínima para aprobar el curso es de 70, si el estudiante obtuvo una nota entre
	 * 60 y 69 tiene derecho de ir a convocatoria, pero si la nota es inferior a 60, el
	 * estudiante reprobó el curso.
	 */
	

	public static void main(String[] args) {
		
		int grade;
		
		sout.print("Enter the grade: ");
		grade = input.nextInt();
		
		if(grade<0 || grade >100) {
			
			sout.print("The grade should be a number bewteen 0 and 100");
			
		}else if(grade >= 70) {
				sout.print("Approved");
			}else if(grade > 59 && grade<70){
				sout.print("Convocatoria");
				
			}else {
				sout.print("Reprobated");
			}
		}
		
	
	/*
	 * if(grade>=70){
	 * 	sout.print("pasó");
	 * }else{
	 * 	if(grade >= 60){
	 * 		sout.print("convocatoria")
	 * 	}else{
	 * 		sout.print("reprobó")
	 * }
	 */
	

}
