
public class boxingEUnboxing {

	public static void main(String[] args) {
		// Boxing
		int x = 20;
		Object obj = x;
		System.out.println(obj);
		
		// Unboxing (Uso de casting)
		int y;
		y = (int) obj;
		System.out.println(y);
		
		/* Unboxing usando as wrapper classes
		 * Trata os tipos primitivos como classes com o objetivo de realizar 
		 * conversoes sem a utilização de casting
		Integer x = 20;
		Object obj = x;
		System.out.println(obj);
		
		int y = obj * 2;
		System.out.println(y)
		* A vantagem de se usar os wrapper classes em vez de dados primitivos
		* é o fato de que eles aceitam valores nulos, ao contrario dos
		* dados primitivos que não aceitam
		* 
		*/
	}

}
