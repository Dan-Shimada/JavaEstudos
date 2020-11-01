package entidades;

public class ImportedProduct extends Product{
	public Double customFee;

	public ImportedProduct(String name, Double price, Double customFee) {
		super(name, price);
		this.customFee = customFee;
	}
	
	public Double getCustomFee() {
		return customFee;
	}

	public void setCustomFee(Double customFee) {
		this.customFee = customFee;
	}

	@Override
	public String priceTag() {
		return this.name
				+ "$" 
				+price
				+ "Custom fee: $"
				+ customFee
				+ "\n";
	}
	
	public Double totalPrice() {
		return this.price + customFee;
	}
	
}
