import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {
		List<String> listas = new ArrayList<>();
		
		// Adicioar elementos na lista
		listas.add("Maria");
		listas.add("Alex");
		listas.add("Bob");
		listas.add("Anna");
		listas.add(2, "Marco");
		
		// Printa os elementos da lista atraves do for each
		for(String x : listas) {
			System.out.println(x);
		}
		
		// exibe o tamanho da lista
		System.out.print("Tamanho da lista: ");
		System.out.println(listas.size());
		
		// remove os elementos se este possuir determinado caractere
		System.out.println("------------------------");
		System.out.println("Remove todos os nomes que iniciam com a letra M");
		//listas.remove("Anna");
		//listas.remove(1);
		listas.removeIf(x -> x.charAt(0) == 'M');
		for (String x : listas) {
			System.out.println(x);
		}
		System.out.print("Tamanho da lista: ");
		System.out.println(listas.size());
		
		// Encontrar a posicao de um elemento
		System.out.println("------------------------");
		System.out.println("Posicao do elemento Bob: " +listas.indexOf("Bob"));
		System.out.println("Posicao do elemento Anna: " +listas.indexOf("Anna"));
		System.out.println("Posicao do elemento Maria: " +listas.indexOf("Maria"));
		
		// Imprimir os elementos que começam com determinada letra, neste caso a letra A
		// listas.stream converte a lista para o tipo stream(este aceita operacoes com expressoes lambda
		// a partir dessa stream, esta recebe um filter que devolve um stream conforme o predicado desejado
		// Como o stream não é compativel com o tipo list, é necessário converte-lo de novo para lista usando a funcao collect
		System.out.println("------------------------");
		List<String> resultado = listas.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : resultado) {
			System.out.println(x);
		}
		
		// Encontra o primeiro elemento de acordo com o predicado desejeado, neste caso nomes que começam 
		// com a letra A
		System.out.println("------------------------");
		String name = listas.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);

	}

}
