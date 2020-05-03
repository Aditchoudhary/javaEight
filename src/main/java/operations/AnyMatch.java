package operations;

import java.util.stream.Stream;

import model.Address;

/**
 * AnyMatch return true or false
 * 
 * @author aditm
 *
 */
public class AnyMatch {

	public static void main(String[] args) {
		Address a1 = new Address("kanker Kera", 12);
		Address a2 = new Address("Defence", 53);
		Address a3 = new Address("ShardhaPuri", 40);
		Address a4 = new Address("Modipuram", 10);

		boolean flag = anyOnLivesOnStreet("Defence", Stream.of(a1, a2, a3, a4));
		System.out.println(flag);

		boolean flag2 = anyOnLivesOnStreet("Meerut", Stream.of(a1, a2, a3, a4));
		System.out.println(flag2);
	}

	private static boolean anyOnLivesOnStreet(String streetName, Stream<Address> stream) {
		return stream.anyMatch(a -> a.getStreetName().equals(streetName));
	}

}
