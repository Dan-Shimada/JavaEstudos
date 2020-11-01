package entidades;

import java.util.Date;

public class UsedProduct extends Product{
	public Date manucatureDate;

	public UsedProduct(String name, Double price, Date manucatureDate) {
		super(name, price);
		this.manucatureDate = manucatureDate;
	}

	public Date getManucatureDate() {
		return manucatureDate;
	}

	public void setManucatureDate(Date manucatureDate) {
		this.manucatureDate = manucatureDate;
	}
	
	@Override
	public String priceTag() {
		return name
				+ "(used) $" 
				+price
				+ "(Manufacture date: "
				+ manucatureDate
				+ "\n";
	}
}
