public class Address {

    private String street;
    private int houseNumber;
    private int flatNumber;
    private String postcode;
    private String city;

    public Address(String street, int houseNumber, int flatNumber, String postcode, String city) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.flatNumber = flatNumber;
        this.postcode = postcode;
        this.city = city;
    }
}
