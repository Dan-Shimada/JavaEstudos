package exercicios;
import java.util.Locale;
import java.util.Scanner;

public class exercicioCondicional04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scr = new Scanner(System.in);
		
		System.out.print("Hora inicial: ");
		int horaInicial = scr.nextInt();
		
		System.out.print("Hora final: ");
		int horaFinal = scr.nextInt();
		
		int duracao = horaFinal - horaInicial;
		
		if(duracao >= 1 && duracao <= 24) {
			System.out.printf("O jogo durou %d hora(s)", duracao);
		} else {
			System.out.print("Duracao invalida");
		}		
		scr.close();
	}

}
