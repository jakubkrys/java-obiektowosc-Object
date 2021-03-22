import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class RealEstateApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        RealEstateRepo realEstateRepo = new RealEstateRepo();
        int option;

        do {
            System.out.println("----- Real Estate App -----");
            System.out.println("1 - add real estate");
            System.out.println("2 - display all");
            System.out.println("0 - quit");
            option = scanner.nextInt();
            scanner.nextLine(); // \n

            switch(option){
                case 1:
                    System.out.print("Estate number: ");
                    int estateNumber = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Bound: ");
                    String bound = scanner.nextLine();
                    System.out.print("Register number: ");
                    String landRegisterNumber = scanner.nextLine();
                    System.out.print("Description: ");
                    String description = scanner.nextLine();
                    System.out.print("Street: ");
                    String street = scanner.nextLine();
                    System.out.print("House no.: ");
                    int houseNumber = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Flat no.: ");
                    int flatNumber = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Postal code: ");
                    String postcode = scanner.nextLine();
                    System.out.print("City: ");
                    String city = scanner.nextLine();

                    Address address = new Address(street,houseNumber,flatNumber,postcode,city);
                    RealEstate realEstate = new RealEstate(estateNumber,bound,address,landRegisterNumber,description);
                    realEstateRepo.add(realEstate);
                    break;
                case 2:
                    realEstateRepo.displayAll();
                    break;
            }

        } while(option != 0);
    }
}
