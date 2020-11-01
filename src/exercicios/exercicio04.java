package exercicios;
import java.util.Locale;
import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scr = new Scanner(System.in);
		
		System.out.print("Funcionario ID = ");
		int funcID = scr.nextInt();
		
		System.out.print("Horas trabalhadas = ");
		double horasTrabalhadas = scr.nextDouble();
		
		System.out.print("Salario/hora = ");
		double salarioHora = scr.nextDouble();
		
		double salario = horasTrabalhadas * salarioHora;
		
		System.out.printf("ID do funcionario = %d", funcID);
		System.out.printf("Salario = %.2f", salario);
		scr.close();
	}

}
