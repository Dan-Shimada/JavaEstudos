import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class arquivoTextoEscrita1 {

	public static void main(String[] args) {
		String[] lines = new String[] { "Bom dia", "Boa tarde", "Boa noite"};
		String path = "C:\\Java Projetos\\Eclipse\\curso_java\\JavaProjects\\in2.txt";
		
		// Para não recriar o arquivo e não sobrepor o que jah estiver escrito la dentro, 
		// coloca-se o true como argumento
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			} 
			System.out.print("Arquivo criado");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
