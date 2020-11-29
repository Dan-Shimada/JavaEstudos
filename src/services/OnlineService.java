package services;

public interface OnlineService {
	public double paymentFee(double amount);
	public double interest(double amount, int month);
}
