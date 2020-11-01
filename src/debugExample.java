import java.util.Locale;
import java.util.Scanner;

public class debugExample {
	public static void main(String[] args) {
		
		// Clicar duas vezes na barra lateral esquerda sobre a linha desejada
		// Clicar com o botão direito sobre o arquivo, clicar em Run as Java Application
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);
		sc.close();
	}
}