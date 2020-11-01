import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// outra forma de se ler um arquivo texto

public class arquivoTextoLeitura3 {

	public static void main(String[] args) {
		
		String path = "C:\\Java Projetos\\Eclipse\\curso_java\\JavaProjects\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			
			// enquanto a linha for diferente de nulo, então foi lido com
			// sucesso a linha
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		}
	}


