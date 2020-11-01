package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicioPoo3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		exercicioPooAluno student = new exercicioPooAluno();
		student.nome = sc.nextLine();
		student.nota1 = sc.nextDouble();
		student.nota2 = sc.nextDouble();
		student.nota3 = sc.nextDouble();
		System.out.printf("FINAL GRADE: %.2f%n", student.notaFinal());
		if (student.notaFinal() < 60.0) {
		System.out.println("FAILED");
		System.out.printf("MISSING %.2f POINTS%n", student.pontosFaltando());
		}
		else {
		System.out.println("PASS");
		}
		sc.close();
	}
}
