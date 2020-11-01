package exercicios;
import java.util.Locale;
import java.util.Scanner;

public class exercicioCondicional03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scr = new Scanner(System.in);
		
		System.out.print("Digite o valor de A: ");
		int a = scr.nextInt();
		
		System.out.print("Digite o valor de B: ");
		int b = scr.nextInt();
		
		if (b % a == 0) {
			System.out.print("São multiplos");
		} else {
			System.out.println("Não são multiplos");
		}
		scr.close();
	}
}
