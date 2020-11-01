import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// outra forma de se ler um arquivo texto

public class arquivoTextoLeitura2 {

	public static void main(String[] args) {
		
		String path = "C:\\Java Projetos\\Eclipse\\curso_java\\JavaProjects\\in.txt";
		
		// declaracao das streams
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			// instanciacao das streams
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			String line = br.readLine();
			
			// enquanto a linha for diferente de nulo, então foi lido com
			// sucesso a linha
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally { // fecha as streams
			try {
				if (br != null) {
					br.close();
				}
				if (fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
