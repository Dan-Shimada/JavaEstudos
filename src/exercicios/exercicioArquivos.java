package exercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.ProdutosArquivos;

public class exercicioArquivos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<ProdutosArquivos> list = new ArrayList<>();

		//System.out.println("Digite o caminho do arquivo: ");
		String sourceFileStr = "C:\\Java Projetos\\Eclipse\\curso_java\\JavaProjects\\produtos.csv";
		File sourceFile = new File(sourceFileStr);
		
		
		// Obtem o caminho em que esta o arquivo em seguida cria um subdiretorio \\out 
		String sourceFolderStr = sourceFile.getParent();
		boolean success = new File(sourceFolderStr + "\\out").mkdir();
				
		// a partir do diretorio \\out criado, cria-se o arquivo destino
		String targetFileStr = sourceFolderStr + "\\out\\summary.csv";
		
		// tratamento de leitura das informacoes contidas no arquivo produto.csv
		try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {

			String itemCsv = br.readLine();
			while (itemCsv != null) {
				
				// separa em strings cada vez que encontrar uma virgula
				String[] fields = itemCsv.split(",");
				
				// armazena o vetor [0] na string name
				String name = fields[0];
				
				// armazena o vetor [1] e o [2] no tipo double/int
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);
				
				// a lista ficou definida como field[0] = name, field[1] = price e field[2] = quantity devido a separacao a partir do método split
				
				// adiciona os elementos 
				list.add(new ProdutosArquivos(name, price, quantity));
					
				itemCsv = br.readLine();
			}
			
			// tratamento da escrita dos elementos presentes no arquivo produto.csv para o arquivo summary.csv 
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
				
				// Para cada item presente na lista, realiza a escrita no arquivo summary.csv com as contas solicitadas pelo problema
				for (ProdutosArquivos item : list) {
					bw.write(item.getName() + "," + String.format("%.2f", item.total()));
					bw.newLine();
				}

				System.out.println(targetFileStr + " CREATED!");
			// tratamento dos erros
			} catch (IOException e) {
				System.out.println("Error writing file: " + e.getMessage());
			}

		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}

		sc.close();
	}
}

