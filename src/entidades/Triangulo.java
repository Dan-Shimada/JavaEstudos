package entidades;

public class Triangulo {
		//Atributos da classe
		public double a;
		public double b;
		public double c;
		
		//Fun��o
		public double area() {
			double p = (a + b + c) / 2.0;
			return Math.sqrt(p * (p - a) * (p - b) * (p - c));
			
		}
	}

