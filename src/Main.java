import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List customers = new ArrayList(); // java 1.4 code using java 1.8 compiler

		Customer customer1 = new Customer(1, "Simon Brown", "10 East Street");
		Customer customer2 = new Customer(1, "Jean White", "16 North Road");
		Customer customer3 = new Customer(1, "Alison Green", "9 South Gardens");

		customers.add(customer1); // java 1.4 code using java 1.8 compiler
		customers.add(customer2); // java 1.4 code using java 1.8 compiler
		customers.add(customer3); // java 1.4 code using java 1.8 compiler

		// Problem 1 solved by Generics, need to cast
		// This is how looping using iterator had to be done prior to java 1.5
		// we have to cast the iterator to access proper class methods
		Iterator it = customers.iterator(); // java 1.4 code using java 1.8 compiler
		while (it.hasNext()) {
			Customer customerNext = (Customer) it.next(); // this casting 'problem' is solved by Generics
			System.out.println(customerNext.getName());

		}

		// Problem 2 solved by Generics, mixed data types in same collection
		// Mixing different data types in a collection is allowed but will not be
		// detected until run-time. Using Generics it will be detected at compile-time.
		customers.add("customer 4"); // java 1.4 code using java 1.8 compiler

		System.out.println();

		// repeat using Generics - from java 1.5
		List<Customer> gCustomers = new ArrayList<Customer>();

		Customer gCustomer1 = new Customer(1, "Simon Brown", "10 East Street");
		Customer gCustomer2 = new Customer(1, "Jean White", "16 North Road");
		Customer gCustomer3 = new Customer(1, "Alison Green", "9 South Gardens");

		gCustomers.add(gCustomer1);
		gCustomers.add(gCustomer2);
		gCustomers.add(gCustomer3);

		// Problem 1 solved by Generics, no need to cast
		Iterator<Customer> it2 = gCustomers.iterator();
		while (it2.hasNext()) {
			// Customer customerNext = it2.next(); // this casting 'problem' is solved by
			// Generics
			// System.out.println(customerNext.getName());
			System.out.println(it2.next().getName());

		}

		System.out.println();
		// Problem 2 solved by Generics, mixed data types detected at compile time
		// gCustomers.add("customer 4");

		for (Customer nextCustomer : gCustomers) {
			System.out.println(nextCustomer.getName());
		}

		// Test Generic class StringWorker (defined by myself)

		StringWorker<String, String> sw = new StringWorker<String, String>("hallo", "world");
		System.out.println(sw.toString());

		StringWorker<String, Integer> swi = new StringWorker<String, Integer>("hallo", 123);
		System.out.println(swi.toString());

		StringWorker<String, Customer> swc = new StringWorker<String, Customer>("Hallo", gCustomer1);
		System.out.println(swc.toString());
		
	}
}
