import java.util.*;

public class Taxperson {
	public static void main(String[] args) {
		double cost;
		double total_cost = 0;
		System.out.println("Please enter the item code:");
		System.out.println("1. Enter n for necceessity Item");
		System.out.println("2. Enter l for luxury Item");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String c = scan.next();
		if (c.equals("n")) {
			cost = 1000;
			total_cost = cost + (cost * 0.01);
		} else {
			cost = 5000;
			total_cost = cost + (cost * 0.09);
		}
		System.out.println("The total cost of the item is:" + total_cost
				+ "cents");
	}

}
