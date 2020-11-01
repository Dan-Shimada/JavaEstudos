import java.io.File;
import java.util.Scanner;

public class manipularPastas {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		
		System.out.print("Digite o caminho da pasta: ");
		String strPath = scr.nextLine();
		
		// uma variavel do tipo File pode ser tanto caminho de arquivo
		// quanto caminho de uma pasta
		File path = new File(strPath);
		
		// a funcao isDirectory manda listar somente quem for diretorio/pasta
		// Cria-se um vetor de files indicando cada caminho
		// E lista as pastas presentes no caminho desejado
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("Pastas: ");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		// Cria-se um vetor de files indicando cada caminho
		// E lista os arquivos presentes no caminho desejado
		File[] files = path.listFiles(File::isFile);
		System.out.println("Arquivos: ");
		for (File file : files) {
			System.out.println(file);
		}
		
		
		// Criar uma sub pasta a partir da pasta Java Projetos
		boolean success = new File(strPath + "\\PastaCriadaAPartirDoCodigoManipularPastas").mkdir();
		System.out.println("Diretorio criado com sucesso: " + success);
		
		scr.close();
	}

}
