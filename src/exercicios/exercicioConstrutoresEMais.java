package exercicios;

import java.util.Locale;
import java.util.Scanner;

import entidades.exercicioConstrutoresEMaisApoio;

public class exercicioConstrutoresEMais {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scr = new Scanner(System.in);
		exercicioConstrutoresEMaisApoio banco = null;
		
		System.out.print("Enter account number: ");
		int numConta = scr.nextInt();
		
		System.out.print("Enter account holder: ");
		scr.nextLine();
		String nome = scr.nextLine();
		
		System.out.print("Is there an initial deposite(y/n)? ");
		char verificacao = scr.next().charAt(0);
		
		if(verificacao == 'y') {
			System.out.print("Enter initial deposit value: ");	
			double deposito= scr.nextDouble();
			banco  = new exercicioConstrutoresEMaisApoio(numConta,nome,deposito);
		} else if (verificacao == 'n') {
			banco  = new exercicioConstrutoresEMaisApoio(numConta,nome);
		}

		System.out.println();
		System.out.println("Account data:");
		System.out.println(banco);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double valorDeposito = scr.nextDouble();
		banco.Deposit(valorDeposito);
		System.out.println("Updated account data: ");
		System.out.println(banco);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double valorRetirada = scr.nextDouble();
		banco.Retirar(valorRetirada);
		System.out.println("Updated account data: ");
		System.out.println(banco);
		
		
		scr.close();
	}

}
