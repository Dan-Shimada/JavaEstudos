import java.util.Locale;
import java.util.Scanner;

public class scannerLesson {

	public static void main(String[] args) {
		/*
		 * Para digitar String Scanner scr = new Scanner(System.in); String x; x =
		 * scr.next(); System.out.println("Voce didigou: " + x); scr.close();
		 */

		/*
		 * Para digitar um numero inteiro Scanner scr = new Scanner(System.in); int x; x
		 * = scr.nextInt(); System.out.println("Voce didigou: " + x); scr.close();
		 */

		/*
		 * Para digitar um numero double com notacao virgula Scanner scr = new
		 * Scanner(System.in); double x; x = scr.nextDouble();
		 * System.out.println("Voce didigou: " + x); scr.close();
		 */

		/*
		 * Para digitar um numero double com notacao ponto Locale.setDefault(Locale.US);
		 * Scanner scr = new Scanner(System.in); double x; x = scr.nextDouble();
		 * System.out.printf("Voce didigou: %.2f%n" , x); scr.close();
		 */

		/*
		 * Para digitar um caractere Locale.setDefault(Locale.US); Scanner scr = new
		 * Scanner(System.in); char x; x = scr.next().charAt(0);
		 * System.out.println("Voce didigou: " + x); scr.close();
		 */

		/*
		 * Para ler diversos tipos Locale.setDefault(Locale.US); Scanner scr = new
		 * Scanner(System.in); String x; int y; double z; x = scr.next(); y =
		 * scr.nextInt(); z = scr.nextDouble(); System.out.println("Dados digitados:");
		 * System.out.println(x); System.out.println(y); System.out.println(z);
		 * scr.close();
		 */

		/* Ler um texto ate a quebra da linha
		Locale.setDefault(Locale.US);
		Scanner scr = new Scanner(System.in);
		String s1, s2, s3;

		s1 = scr.nextLine();
		s2 = scr.nextLine();
		s3 = scr.nextLine();

		System.out.println("Dados digitados:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		scr.close();
		 */
		
		/*Atencao para a quebra de linha pendente - PROBLEMA
		Locale.setDefault(Locale.US);
		Scanner scr = new Scanner(System.in);
		int x;
		String s1, s2, s3;
		
		x = scr.nextInt();
		s1 = scr.nextLine();
		s2 = scr.nextLine();
		s3 = scr.nextLine();

		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		scr.close();
		*/
		
		/*Atencao para a quebra de linha pendente - SOLUCAO PARA O PROBLEMA ACIMA
		Locale.setDefault(Locale.US);
		Scanner scr = new Scanner(System.in);
		int x;
		String s1, s2, s3;
		
		x = scr.nextInt();
		scr.nextLine();
		s1 = scr.nextLine();
		s2 = scr.nextLine();
		s3 = scr.nextLine();

		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		scr.close();
		*/
	}

}
