package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicioMatriz {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scr = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de linhas: ");
		int m = scr.nextInt();
		
		System.out.print("Digite o valor de colunas: ");
		int n = scr.nextInt();
		
		int[][] matrizOcorr = new int[m][n];
		
		System.out.println("Digite os valores da matriz:");
		for (int i = 0; i<matrizOcorr.length; i++) {
			for (int j = 0; j<matrizOcorr[i].length; j++) {
				matrizOcorr[i][j] = scr.nextInt();
			}	
		}
		
		scr.nextLine();
		System.out.print("Digite um valor da matriz: ");
		int valor = scr.nextInt();
		
		for(int i = 0; i<matrizOcorr.length; i++) {
			for (int j = 0; j<matrizOcorr[i].length; j++) {
				if (matrizOcorr[i][j] == valor) {
					System.out.println("Position: ["+i+"]["+j+"]");
					
					if (j > 0) {
						System.out.println("Left: " + matrizOcorr[i][j-1]);
					}
					
					if (i > 0) {
						System.out.println("Up: " + matrizOcorr[i-1][j]);
					}
					
					if (j < matrizOcorr[i].length-1) {
						System.out.println("Right: " + matrizOcorr[i][j+1]);
					}
					
					if (i < matrizOcorr.length-1) {
						System.out.println("Down: " + matrizOcorr[i+1][j]);
					}
				}
			}
		}
	}

}
