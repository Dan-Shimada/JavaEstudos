package exercicios;
import java.util.Locale;
import java.util.Scanner;

public class exercicioCondicional01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scr = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int num = scr.nextInt();
		
		if (num < 0) {
			System.out.println("Numero negativo");
		} else {
			System.out.println("Numero positivo");
		}
	}

}
