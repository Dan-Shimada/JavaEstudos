package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicioPoo2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scr = new Scanner(System.in);
		
		exercicioPooEmpregado empregado = new exercicioPooEmpregado();
		
		System.out.print("Nome: ");
		empregado.Name = scr.nextLine();
		
		System.out.print("Gross Salary: ");
		empregado.GrossSalary = scr.nextDouble();
		
		System.out.print("Tax: ");
		empregado.Tax = scr.nextDouble();
		
		System.out.print("Employee:");
		System.out.printf("%s, %.2f", empregado.Name, empregado.NetSalary());
		
		System.out.println();
		System.out.print("Which percentage to increasy salary?");
		empregado.IncreaseSalary(scr.nextDouble());
		
		System.out.print("Updated data: ");
		System.out.printf("%s, %.2f", empregado.Name, empregado.NetSalary());
		scr.close();
		
	}

}
