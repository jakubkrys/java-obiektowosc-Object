package pl.jakubkrys.animal_shelter;

import java.util.Objects;

public class Animal {

    private String name;
    private String breed;
    private int age;
    private String healthStatus;
    private String adoptionStatus;

    public Animal(String name, String breed, int age, String healthStatus, String adoptionStatus) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.healthStatus = healthStatus;
        this.adoptionStatus = adoptionStatus;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", healthStatus='" + healthStatus + '\'' +
                ", adoptionStatus='" + adoptionStatus + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name) && Objects.equals(breed, animal.breed) && Objects.equals(healthStatus, animal.healthStatus) && Objects.equals(adoptionStatus, animal.adoptionStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, breed, age, healthStatus, adoptionStatus);
    }
}
