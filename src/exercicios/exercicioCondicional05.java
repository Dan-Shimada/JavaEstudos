package exercicios;
import java.util.Locale;
import java.util.Scanner;

public class exercicioCondicional05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scr = new Scanner(System.in);
		
		double preco;
		
		System.out.print("Codigo: ");
		int cod = scr.nextInt();
		
		System.out.print("Quantidade: ");
		int qtd = scr.nextInt();
		
		if (cod == 1) {
			preco = 4.00;
			double total = preco * qtd;
			System.out.printf("Total = %.2f", total);
		} else if (cod == 2) {
					preco = 4.50;
					double total = preco * qtd;
					System.out.printf("Total = %.2f", total);
				} else if (cod == 3) {
						preco = 5.00;
						double total = preco * qtd;
						System.out.printf("Total = %.2f", total);
						} else if (cod == 4) {
								preco = 2.00;
								double total = preco * qtd;
								System.out.printf("Total = %.2f", total);
								} else if (cod == 5) {
										preco = 1.50;
										double total = preco * qtd;
										System.out.printf("Total = %.2f", total);
								}

		
		

		
	
		

	}

}
