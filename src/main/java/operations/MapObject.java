package operations;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import model.Address;

public class MapObject {
	public static void main(String[] args) {
	
		Address a1 = new Address("kanker Kera", 12);
		Address a2 = new Address("Defence", 53);
		Address a3 = new Address("ShardhaPuri", 40);
		Address a4 = new Address("Modipuram", 10);
		Address a5 = new Address("Singapore ", 12);

		Stream<Address> stream = Stream.of(a1,a2,a3,a4,a5);
		java.util.Map<Integer, Address> map = stream.collect(Collectors.
				toMap(Address::getHouseNo,Function.identity(),
						(value1, value2)-> value2));
	
		map.forEach((key,value)->{
			System.out.println("key:"+ key + ", "+ value);
		});
		
	}
}
