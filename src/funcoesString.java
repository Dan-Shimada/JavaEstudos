import java.util.Locale;
import java.util.Scanner;

public class funcoesString {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scr = new Scanner(System.in);
		
		String original = "abcde FGHIJ ABC abc DEFG     ";
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2); // Recorta a string a partir do 2(inicia contando a partir do 0 e não do 1)
		String s05 = original.substring(2,9);
		String s06 = original.replace('a','x');
		String s07 = original.replace("abc","xyz");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		System.out.println("Original: " +original+ "-");
		System.out.println("toLowerCase aplicado: " + s01+ "-");
		System.out.println("toUpperCase aplicado: " + s02+ "-");
		System.out.println("trim aplicado: " + s03+ "-");
		System.out.println("substring(2) aplicado: " + s04+ "-");
		System.out.println("substring(2,9) aplicado: " + s05+ "-");
		System.out.println("replace('a','x') aplicado: " + s06+ "-");
		System.out.println("substring(''abc'',''xyz'') aplicado: " + s07+ "-");
		System.out.println("indexOf(''bc'') aplicado: " +i);
		System.out.println("LastIndexOf(''bc'') aplicado: " +j);
		

	}

}
