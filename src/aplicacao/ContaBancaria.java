package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.AccountExc;
import model.exceptions.TratamentoExcecao;

public class ContaBancaria {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Enter account data: ");
		System.out.print("Number: ");
		int number = scr.nextInt();
		
		System.out.print("Holder: ");
		String holder = scr.nextLine();
		
		scr.nextLine();
		System.out.print("Initial Balance: ");
		double initBalance = scr.nextDouble();
		
		System.out.print("Withdraw limit: ");
		double withdrawLimit = scr.nextDouble();

		AccountExc acc = new AccountExc(number, holder, initBalance, withdrawLimit);
		
		System.out.print("Enter amount for withdraw: ");
		double withdrawAmount = scr.nextDouble();
		
		try {
			acc.withdraw(withdrawAmount);
			System.out.println("New balance: " + String.format("%.2f", acc.getBalance()));
		} catch (TratamentoExcecao e) {
			System.out.println("Withdraw error: " + e.getMessage());
			
		}	
		scr.close();
	}

}
