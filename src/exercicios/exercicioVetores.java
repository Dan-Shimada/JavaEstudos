package exercicios;

import java.util.Locale;
import java.util.Scanner;

import entidades.hotelQuartos;

public class exercicioVetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scr = new Scanner(System.in);
		
		hotelQuartos[] vect = new hotelQuartos[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = scr.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			scr.nextLine();
			String name = scr.nextLine();
			System.out.print("Email: ");
			String email = scr.nextLine();
			System.out.print("Room: ");
			int room = scr.nextInt();
			vect[room] = new hotelQuartos(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i=0; i<10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		scr.close();
		
		/*
		hotelQuartos quartos = null;
		hotelQuartos[] quartosQtd = new hotelQuartos[9];
		String name = null, email = null;
		int roomNumber = 0;
		
		System.out.print("How many rooms will be rented? ");
		int n = scr.nextInt();
		hotelQuartos[] quartoAlugado = new hotelQuartos[n];
		
		System.out.println();
		for(int i = 0; i<quartoAlugado.length; i++) {
			System.out.println("Rent #" +i);
			
			System.out.print("Name: ");
			name = scr.next();
			
			scr.nextLine();
			System.out.print("Email: ");
			email = scr.nextLine();
			
			System.out.print("Room: ");
			roomNumber = scr.nextInt();
			
			quartoAlugado[i] = new hotelQuartos(name, email, roomNumber); 
			System.out.println();
		}
		
		System.out.println("Busy Rooms: ");
		for (int i = 0; i<quartoAlugado.length; i++) {
			if(quartoAlugado[i] != null) {
				System.out.println(quartoAlugado[i]);
			}	
		}
		 */
	}

}
