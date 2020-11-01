package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class problemaComOrientacaoObjeto2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scr = new Scanner(System.in);
		
		Produto produto = new Produto();
		System.out.println("Entre com o nome do produto: ");
		
		System.out.print("Nome: ");
		produto.nome = scr.nextLine();
		
		System.out.print("Preco: ");
		produto.preco = scr.nextDouble();
		
		System.out.print("Quantidade: ");
		produto.quantidade = scr.nextInt();
		
		System.out.println("Produtos: " + produto);
		
		System.out.println();
		System.out.print("Quantidade de produtos a serem adicionados em estoque: ");
		int quantidade = scr.nextInt();
		produto.addProdutos(quantidade);
		
		System.out.println();
		System.out.print("Dados atualizados: " +produto);
		
		System.out.println();
		System.out.println();
		System.out.print("Quantidade de produtos a serem removidos em estoque: ");
		quantidade = scr.nextInt();
		produto.removeProdutos(quantidade);
		
		System.out.println();
		System.out.print("Dados atualizados: " +produto);
		
		scr.close();
	}

}
