package exercicios;
import java.util.Locale;
import java.util.Scanner;

public class exercicioCondicional07 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scr = new Scanner(System.in);
		
		System.out.print("Digite o valor x: ");
		double x = scr.nextDouble();
		
		System.out.print("Digite o valor y: ");
		double y = scr.nextDouble();
		
		// Identifica se o valor cai em algum dos eixos Q1,Q2,Q3 ou Q4
		if (x > 0 && y > 0) {
			System.out.println("Q1");
		} else if (x < 0 && y > 0) {
					System.out.println("Q2");
				} else if (x < 0 && y < 0) {
							System.out.println("Q3");
						} else if (x > 0 && y < 0) {
									System.out.println("Q4");
								}
		
		// Identifica se o valor cai no eixo x
		if (x == 0 && y == 0) {
			System.out.print("Origem");
		} else if (x >= 0 && y == 0) {
					System.out.print("Eixo x");
				} else if (x <= 0 && y == 0) {
						System.out.print("Eixo x");
						} else if (y >= 0 && x == 0) {
									System.out.print("Eixo y");
								} else if (y <= 0 && x == 0) {
									System.out.print("Eixo y");
								}
		scr.close();
	}

}
