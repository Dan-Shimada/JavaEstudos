package exercicios;
import java.util.Locale;
import java.util.Scanner;

public class exercicio05 {
	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner scr = new Scanner(System.in);
		
		System.out.print("Roupa ID = ");
		int roupaID1 = scr.nextInt();
		
		System.out.print("Quantidade = ");
		int qtd1 = scr.nextInt();
				
		System.out.print("Valor por peca = ");
		double valorUN1 = scr.nextDouble();
		
		System.out.print("Roupa ID = ");
		int roupaID2 = scr.nextInt();
		
		System.out.print("Quantidade = ");
		int qtd2 = scr.nextInt();
				
		System.out.print("Valor por peca = ");
		double valorUN2 = scr.nextDouble();

		double total1 = qtd1 * valorUN1;
		double total2 = qtd2 * valorUN2;
		
		double valorTotal = total1 + total2;
		System.out.printf("Total = %.2f", valorTotal);
		scr.close();
	}
}		
