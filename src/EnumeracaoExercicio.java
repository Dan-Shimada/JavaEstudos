
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Client;
import entidades.Order;
import entidades.OrderItem;
import entidades.Product;
import entidadesenum.OrderStatus;

public class EnumeracaoExercicio {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner scr = new Scanner(System.in);
		
		List<OrderStatus> pedido = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = scr.nextLine();
		System.out.print("Email: ");
		String email = scr.nextLine();
		System.out.print("Birth date(DD/MM/YYYY): ");
		Date birthDate = sdf.parse(scr.next());
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(scr.next());
		
		Order order = new Order((java.sql.Date) new Date(), status, client);
		
		System.out.println("How many items to this order? ");
		int n = scr.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Enter #" +i+ " item data");
			System.out.print("Product name: ");
			String nameProduto = scr.nextLine();
			scr.nextLine();
			System.out.print("Product price: ");
			double preco = scr.nextDouble();
			
			Product produto = new Product(nameProduto, preco);
			
			System.out.print("Quantity: ");
			int quantity = scr.nextInt();
			
			OrderItem orderItem = new OrderItem(quantity, preco, produto);
			
			order.addItem(orderItem);
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY");
		System.out.println(order);
		
		scr.close();
		
	}

}
