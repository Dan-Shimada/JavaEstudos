package exercicios;
import java.util.Locale;
import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scr = new Scanner(System.in);
		
		System.out.print("Valor de a = ");
		int a = scr.nextInt();
		
		System.out.print("Valor de b = ");
		int b = scr.nextInt();
		int resultado = a + b;
		System.out.println("A soma de " +a+ " + " +b+ " = " +resultado);
		scr.close();
	}

}
