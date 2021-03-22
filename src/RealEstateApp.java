import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class RealEstateApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
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
                    break;
                case 2:
                    break;
            }

        } while(option != 0);
    }
}
