package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Contract;
import entidades.Installment;
import services.ContratoService;
import services.PaypalService;

public class ContratoAutomatizado {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner scr = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter contract data");
		System.out.print("Number: ");
		int number = scr.nextInt();
		
		System.out.print("Date (dd/MM/yyyy):");
		Date date = sdf.parse(scr.next());

		System.out.print("Contract value: ");
		double amount = scr.nextDouble();
		
		Contract contrato = new Contract(number,date,amount);
		
		System.out.print("Enter number of installments: ");
		int installment = scr.nextInt();
		
		ContratoService contractService = new ContratoService(new PaypalService());
		contractService.processContract(contrato, installment);
		
		System.out.println("Installments:");
		for (Installment x : contrato.getInstallments()) {
			System.out.println(x);
		}
		scr.close();
	}

}
