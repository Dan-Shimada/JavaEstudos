package exercicios;
import java.util.Locale;
import java.util.Scanner;

public class exercicioCondicional02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scr = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int num = scr.nextInt();
		
		if(num % 3 == 0) {
			System.out.print("O numero � impar");
		} else {
			System.out.print("O numero � par");
		}
		scr.close();
	}

}
