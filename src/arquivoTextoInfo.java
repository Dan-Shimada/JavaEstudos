import java.io.File;
import java.util.Scanner;

public class arquivoTextoInfo {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		
		System.out.print("Digite o caminho do arquivo: ");
		String strPath = scr.nextLine();
		
		File path = new File(strPath);
		
		// Exibe somente o nome do arquivo
		System.out.println("Nome do arquivo(getName): " + path.getName());
		
		// Exibe somente o caminho, desprezando o nome
		System.out.println("Nome do arquivo(getParent): " + path.getParent());
		
		// Exibe o caminho e o nome de arquivo
		System.out.println("Nome do arquivo(getPath): " + path.getPath());
		scr.close();
	}

}
