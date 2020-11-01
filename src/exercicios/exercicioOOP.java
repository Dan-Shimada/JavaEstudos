package exercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.Date;

import entidades.ImportedProduct;
import entidades.Product;
import entidades.UsedProduct;

public class exercicioOOP {
	public static void main(String args[]) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner scr = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = scr.nextInt();
		
		for(int i = 1; i<=n; i++) {
			System.out.println("Product " +i+ " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char productOrigin = scr.next().charAt(0);
			
			System.out.print("Name: ");
			String name = scr.nextLine();
			scr.nextLine();
			
			System.out.print("Price: ");
			Double price = scr.nextDouble();
			
			switch(productOrigin) {
				case 'c':
					list.add(new Product(name,price));
				break;
				case 'u':
					System.out.print("Manucature date (DD/MM/YYYY): ");
					Date data = sdf.parse(scr.next());
					list.add(new UsedProduct(name,price,data));
				break;
				case 'i':
					System.out.print("Custom fee: ");
					Double customFee = scr.nextDouble();
					list.add(new ImportedProduct(name,price,customFee));
				break;
				default:
			}
		}
		System.out.println("\nPRICE TAGS:");
		for(Product prod : list) {
			System.out.print(prod.priceTag());
		}
		
		scr.close();
	}
}
