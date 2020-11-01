package exercicios;

public class exercicioPooEmpregado {
	public String Name;
	public double GrossSalary;
	public double Tax;
	
	public double NetSalary() {
		return GrossSalary - Tax;
	}
	
	public void IncreaseSalary(double percentage) {
		GrossSalary += GrossSalary * percentage/100;
	}
}
