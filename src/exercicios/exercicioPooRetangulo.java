package exercicios;

public class exercicioPooRetangulo {
	public double width;
	public double height;
	
	public double Area() {
		return width * height;
	}
	
	public double Perimetro() {
		return 2 * (width * height);
	}
	
	public double Diagonal() {
		return Math.sqrt((width * width) + (height * height)); 
	}
}
