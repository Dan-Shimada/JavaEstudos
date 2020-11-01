package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.User;
import entidades.UserFisico;
import entidades.UserJuridico;

public class ExercicioHerancaEPoli {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scr = new Scanner(System.in);
		
		List<User> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = scr.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" +i+ " data:");
			System.out.print("Individual or company (i/c)?");
			char userType = scr.next().charAt(0);
			
			switch(userType) {
			case 'i':
				System.out.print("Name: ");
				String name = scr.nextLine();
				scr.nextLine();
				System.out.print("Annual Income: ");
				double annualYear = scr.nextDouble();
				System.out.print("Health expenditures: ");
				double healthCost = scr.nextDouble();
				list.add(new UserFisico(name, annualYear, healthCost));
			break;
			case 'c':
				System.out.print("Name: ");
				name = scr.nextLine();
				scr.nextLine();
				System.out.print("Annual Income: ");
				annualYear = scr.nextDouble();
				System.out.print("Number of Employees: ");
				int employeeNum = scr.nextInt();
				list.add(new UserJuridico(name, annualYear, employeeNum));
			break;
			default:
			}
		}
		
		double sum = 0.0;
		System.out.println("TAXES PAID");
		for (User usu : list) {
			System.out.println(usu.getName()+ ": $" +String.format("%.2f", usu.Tax()));
			sum += usu.Tax();
		}
		
		System.out.println("TOTAL TAXES: $" +String.format("%.2f", sum));
		scr.close();
	}
}
