package exercicios;
import java.util.Locale;
import java.util.Scanner;

public class exercicio02 {
	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner scr = new Scanner(System.in);
		
		System.out.print("Raio = ");
		double raio = scr.nextDouble();
		
		double pi = 3.14159;
		double area = pi * (raio * raio);
		
		System.out.printf("Area do circulo = %.4f ", area);
		scr.close();				
	}
}
