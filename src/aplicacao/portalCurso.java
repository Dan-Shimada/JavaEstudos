package aplicacao;

import java.io.IOException;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

import entidades.numAlunos;

public class portalCurso {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scr = new Scanner(System.in);
		Set<numAlunos> set = new HashSet<>();
		String cursoA = "A";
		String cursoB = "B";
		String cursoC = "C";
		
		System.out.print("How many students for course A: ");
		int qtdAlunosA = scr.nextInt();
		for (int countAlunosA = 0; countAlunosA < qtdAlunosA; countAlunosA++) {
			System.out.print("Aluno ID: ");
			int alunoID = scr.nextInt();
			set.add(new numAlunos(cursoA, alunoID));
		}
		
		System.out.print("How many students for course B: ");
		int qtdAlunosB = scr.nextInt();	
		for (int countAlunosB = 0; countAlunosB < qtdAlunosB; countAlunosB++) {
			System.out.print("Aluno ID: ");
			int alunoID = scr.nextInt();
			set.add(new numAlunos(cursoB, alunoID));
		}
		
		System.out.print("How many students for course C: ");
		int qtdAlunosC = scr.nextInt();
		for (int countAlunosC = 0; countAlunosC < qtdAlunosC; countAlunosC++) {
			System.out.print("Aluno ID: ");
			int alunoID = scr.nextInt();
			set.add(new numAlunos(cursoC, alunoID));
		}
		
		System.out.print("Total de alunos: " +set.size());		
		scr.close();
	}

}
