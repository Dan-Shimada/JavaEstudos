package entidades;

public class savingAccount extends Account{
	private Double interestRate;
	
	public savingAccount() {}

	public savingAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	@Override
	public final void withdraw(double amount) {
		balance -= amount;
	}
}
