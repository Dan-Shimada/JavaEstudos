package entidades;

public class UserJuridico extends User {
	public Integer employeeNum;

	public UserJuridico () {}
	
	public UserJuridico(String name, Double annualYear, Integer employee) {
		super(name, annualYear);
		this.employeeNum = employee;
	}

	public Integer getEmployee() {
		return employeeNum;
	}

	public void setEmployee(Integer employee) {
		this.employeeNum = employee;
	}
	
	@Override
	public double Tax() {
		double tax = 0;
		if (employeeNum > 10) {
			tax = annualYear * 0.14;
		} else {
			tax = annualYear * 0.16;
		}
		return tax;
	}
}

