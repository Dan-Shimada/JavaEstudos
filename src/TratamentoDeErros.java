import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoDeErros {
	public static void main(String args[]) {
		System.out.println("Inicio do método 2");
		method1();
		System.out.println("Fim");
	}
	
	public static void method1() {
		System.out.println("Inicio do método 1");
		method2();
		System.out.println("Fim do método 1");
	}
	
	public static void method2(){
		Scanner scr = new Scanner(System.in);
		try {
			String[] vect = scr.nextLine().split(" ");
			int position = scr.nextInt();
			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid position");
			e.printStackTrace();
			scr.next();
		} catch(InputMismatchException e){
			System.out.println("Input error");
		}
		scr.close();
		System.out.println("Fim do método 2");
	}
}
