package model;

public class Address {
  private String streetName;
  private int houseNo;

  public Address(String streetName, int houseNo) {
    this.streetName = streetName;
    this.houseNo = houseNo;

  }


  public String getStreetName() {
    return streetName;
  }

  public int getHouseNo() {
    return houseNo;
  }
}
