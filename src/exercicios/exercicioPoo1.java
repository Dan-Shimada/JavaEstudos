package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicioPoo1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scr = new Scanner(System.in);
		
		exercicioPooRetangulo retangulo = new exercicioPooRetangulo();
		
		System.out.println("Digite os valores da largura e altura");
		System.out.print("Largura = ");
		retangulo.width = scr.nextDouble();
		
		System.out.printf("Altura = ");
		retangulo.height = scr.nextDouble();
		
		System.out.printf("Area = %.2f%n", retangulo.Area());	
		System.out.printf("Perimetro = %.2f%n", retangulo.Perimetro());
		System.out.printf("Diagonal = %.2f%n" , retangulo.Diagonal());
		
		scr.close();
	}

}
