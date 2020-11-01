package exercicios;
import java.util.Locale;
import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scr = new Scanner(System.in);
		
		System.out.print("A = ");
		double A = scr.nextDouble();
		
		System.out.print("B = ");
		double B = scr.nextDouble();
		
		System.out.print("C = ");
		double C = scr.nextDouble();
		
		double areaTriRet = (A * C) / 2;
		System.out.printf("A area do triangulo retangulo que tem A por base C por altura eh %.3f\n", areaTriRet);
		
		double pi = 3.14159;
		double areaCirculo = pi * (C * C);
		System.out.printf("Area do circulo de raio C = %.3f\n", areaCirculo);
		
		double areaTrapezio = ((A + B) * C) / 2;
		System.out.printf("Area do trapezio de bases A e B e altura C = %.3f\n", areaTrapezio);
		
		double areaQuadrado = (B * B);
		System.out.printf("Area do quadrado de lado B = %.3f\n",areaQuadrado);
		
		double areaRet = A * B;
		System.out.printf("Area do retangulo de lados A e B = %.3f\n", areaRet);
		scr.close();
		
	}

}
