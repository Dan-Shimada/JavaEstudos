package entidades;

public abstract class User {
	public String name;
	public Double annualYear;
	
	public User() {}

	public User(String name, Double annualYear) {
		super();
		this.name = name;
		this.annualYear = annualYear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualYear() {
		return annualYear;
	}

	public void setAnualYear(Double annualYear) {
		this.annualYear = annualYear;
	}

	public abstract double Tax();

}

