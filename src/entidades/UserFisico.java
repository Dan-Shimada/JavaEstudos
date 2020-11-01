package entidades;

public class UserFisico extends User {
	public Double healthCost;
	
	public UserFisico() {}	
	
	public UserFisico(String name, Double annualYear, Double healthCost) {
		super(name, annualYear);
		this.healthCost = healthCost;
	}

	public Double getHealthCost() {
		return healthCost;
	}

	public void setHealthCost(Double healthCost) {
		this.healthCost = healthCost;
	}
	
	@Override
	public double Tax() {
		double tax = 0;
		if (annualYear < 20000) {
			if(healthCost > 0) {
				tax = (annualYear * 0.15) - (healthCost * 0.50);
			} else {
				tax = (annualYear * 0.15);
			}
		}
		
		if (annualYear > 20000) {
			if(healthCost > 0) {
				tax = (annualYear * 0.25) - (healthCost * 0.50);
			} else {
				tax = (annualYear * 0.25);
			}	
		}
		return tax;
	}
}
	
	

