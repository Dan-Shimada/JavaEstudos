package entidades;

public class Produto {
	public String nome;
	public double preco;
	public int quantidade;
	
	public double valorTotalEmEstoque(){
		return preco * quantidade;
	}
	
	public void addProdutos(int quantidade) {
		/* para acessar o ATRIBUTO da classe e não o parâmetro do método
		   utiliza-se o método this */
		this.quantidade += quantidade;
		/* A 'quantidade' sem o this refere-se ao parametro quantidade e 
		   nao o atributo quantidade*/
	}
	
	public void removeProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		return nome+ ", $" +String.format("%.2f", preco)+ ", " +quantidade+ "un, Total: $" +String.format("%.2f", valorTotalEmEstoque());
	}
	
}
