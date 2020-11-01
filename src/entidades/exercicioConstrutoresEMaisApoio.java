package entidades;

public class exercicioConstrutoresEMaisApoio {
	private int numConta;
	private String nome;
	private double deposito;
	
	public exercicioConstrutoresEMaisApoio(int numConta, String nome) {
		this.numConta = numConta;
		this.nome = nome;
	}

	public exercicioConstrutoresEMaisApoio(int numConta, String nome, double depositoInicial) {
		this.numConta = numConta;
		this.nome = nome;
		Deposit(depositoInicial);
	}
	
	public int getNumConta() {
		return numConta;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getDeposito() {
		return deposito;
	}
	
	public void Deposit(double valor) {
		deposito += valor;
	}
	
	public void Retirar(Double valor) {
		deposito -= valor;
	}
	
	public String toString() {
		return "Account " +numConta
						+ ", Name: "
						+ nome
						+ ", Balance: $"
						+ String.format("%.2f", deposito);
				
	}
}
