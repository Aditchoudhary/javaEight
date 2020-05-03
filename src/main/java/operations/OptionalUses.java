package operations;
import model.Address;
import model.Person;

import java.util.Optional;

public class OptionalUses {


  public static void main(String[] args) {
    Person p = new Person(22).setName("Adit");
    Optional<Person> optional = Optional.of(p);
    System.out.println("optional = " + optional.get());

    Person pnull = null;
    //Optional<Person> optionalNullable = Optional.of(pnull);
    Optional<Person> optionalNullable = Optional.ofNullable(pnull);
    System.out.println("optionalNullable = " + optionalNullable);

    Optional<Address> optionalWithPersent = p.getAddress();
    optionalWithPersent.ifPresent(System.out::println);

    //Use of filter with Optional
    Address address = new Address("Shardhapuri",541);
    Person personWithAddress  = new Person(23).setAddress(address);
    Optional<Address> optionalWithfilter = personWithAddress.getAddress();
    optionalWithPersent.filter(e->e.getStreetName().equals(""))
      .ifPresent(System.out::println);

  }
}
