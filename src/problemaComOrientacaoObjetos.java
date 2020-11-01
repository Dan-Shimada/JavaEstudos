import java.util.Locale;
import java.util.Scanner;

import entidades.Triangulo;

public class problemaComOrientacaoObjetos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangulo x,y;
		// Para que se possa usar o objeto(Triangulo), ou seja, para que ele exista. 
		// É necessário instanciar, ou seja, criar o objeto e para isso utiliza-se o comando new
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Enter the measures of triangle X: ");
		
		System.out.print("Lado A: ");
		x.a = sc.nextDouble();
		
		System.out.print("Lado B: ");
		x.b = sc.nextDouble();
		
		System.out.print("Lado C: ");
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		
		System.out.print("Lado A: ");
		y.a = sc.nextDouble();
		
		System.out.print("Lado B: ");
		y.b = sc.nextDouble();
		
		System.out.print("Lado C: ");
		y.c = sc.nextDouble();
		
		//Chamada do metodo area
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
			}
	}

}
