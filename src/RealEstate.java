public class RealEstate {

    private int estateNumber;
    private String bound;
    private Address address;
    private String landRegisterNumber;
    private String description;

    public RealEstate(int estateNumber, String bound, Address address, String landRegisterNumber, String description) {
        this.estateNumber = estateNumber;
        this.bound = bound;
        this.address = address;
        this.landRegisterNumber = landRegisterNumber;
        this.description = description;
    }
}
