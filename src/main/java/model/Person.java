package model;

import java.util.Optional;

public class Person {
  private int age;
  private String name;
  private Address address;

  public Person(int age) {
    this.age = age;
  }

  public Person setName(String name) {
    this.name = name;
    return this;
  }

  public Person setAddress(Address address) {
    this.address = address;
    return this;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public Optional<Address> getAddress() {
    return Optional.ofNullable(address);
  }

  @Override
  public String toString() {
    return "Person{" +
      "age=" + age +
      ", name='" + name + '\'' +
      ", address=" + address +
      '}';
  }
}
