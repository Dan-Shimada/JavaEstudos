package exercicios;
import java.util.Locale;
import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scr = new Scanner(System.in);
		
		System.out.print("A = ");
		int A = scr.nextInt();
		
		System.out.print("B = ");
		int B = scr.nextInt();
		
		System.out.print("C = ");
		int C = scr.nextInt();
		
		System.out.print("D = ");
		int D = scr.nextInt();
		
		int DIFERENCA = (A*B) - (C*D);
		System.out.printf("DIFERENCA = (A*B) - (C*D) = %d" , DIFERENCA);
		
		scr.close();		
	}

}
