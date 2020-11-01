import java.io.File;
import java.io.IOException;
import java.util.Scanner;

// uma forma de se ler um arquivo texto

public class arquivoTextoLeitura1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\Java Projetos\\Eclipse\\curso_java\\JavaProjects\\in.txt");
		Scanner scr = null;	
		
		try {
			scr = new Scanner(file);
			while(scr.hasNextLine()) {
				System.out.println(scr.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			if (scr != null) {
				scr.close();
			}
			
		}
	}

}
