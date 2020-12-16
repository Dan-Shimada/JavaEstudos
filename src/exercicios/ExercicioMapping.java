package exercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ExercicioMapping {
	public static void main(String args[]) throws ParseException {
		Scanner scr = new Scanner(System.in);
		Map<String, Integer> votos = new LinkedHashMap<>();
		
		System.out.print("Diretorio: ");
		String path = scr.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while(line != null) {
				String[] campo = line.split(",");
				String nome = campo[0];
				int contagem = Integer.parseInt(campo[1]);
				
				if(votos.containsKey(nome)) {
					int votosParciais = votos.get(nome);
					votos.put(nome,  contagem + votosParciais);
				} else {
					votos.put(nome, contagem + contagem);
				}
				
				line = br.readLine();
			}
			
			for (String chave : votos.keySet()){
				System.out.println(chave + ": " + votos.get(chave));
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		scr.close();
	}
}
