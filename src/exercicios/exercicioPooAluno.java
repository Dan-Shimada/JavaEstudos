package exercicios;

public class exercicioPooAluno {
	public String nome;
	public double nota1, nota2, nota3;
	
	public double notaFinal() {
		return nota1 + nota2 + nota3;
	}
	
	public double pontosFaltando() {
		if (notaFinal() < 60) {
			return 60.00 - notaFinal();
		} else {
			return 0.0;
		}
	}
}

