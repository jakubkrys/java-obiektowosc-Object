package pl.jakubkrys.animal_shelter;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class AnimalShelterApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        AnimalShelterRepo animalShelterRepo = new AnimalShelterRepo();
        Animal animal;
        String name;
        String breed;
        int age;
        String healthStatus;
        String adoptionStatus;
        int option;

        do {
            System.out.println("----- Real Estate App -----");
            System.out.println("1 - add dog");
            System.out.println("2 - add cat");
            System.out.println("3 - display all animals");
            System.out.println("0 - quit");
            option = scanner.nextInt();
            scanner.nextLine(); // \n

            switch(option){
                case 1:
                    System.out.print("Name: ");
                    name = scanner.nextLine();
                    System.out.print("Breed: ");
                    breed = scanner.nextLine();
                    System.out.print("Age: ");
                    age = scanner.nextInt();
                    scanner.nextLine(); // \n
                    System.out.print("Is healthy?: ");
                    healthStatus = scanner.nextLine();
                    System.out.print("Sport skills: ");
                    String sportTrained = scanner.nextLine();
                    System.out.print("Ready to adoption: ");
                    adoptionStatus = scanner.nextLine();

                    animal = new Dog(name,breed,age,healthStatus,sportTrained,adoptionStatus);
                    animalShelterRepo.add(animal);
                    break;
                case 2:
                    System.out.print("Name: ");
                    name = scanner.nextLine();
                    System.out.print("Breed: ");
                    breed = scanner.nextLine();
                    System.out.print("Age: ");
                    age = scanner.nextInt();
                    scanner.nextLine(); // \n
                    System.out.print("Is healthy?: ");
                    healthStatus = scanner.nextLine();
                    System.out.print("Environment adaptation: ");
                    String adaptation = scanner.nextLine();
                    System.out.print("Ready to adoption: ");
                    adoptionStatus = scanner.nextLine();

                    animal = new Cat(name,breed,age,healthStatus,adaptation,adoptionStatus);
                    animalShelterRepo.add(animal);
                    break;
                case 3:
                    animalShelterRepo.displayAll();
                    break;
            }
        } while(option != 0);
        scanner.close();
    }
}
