package pl.jakubkrys.animal_shelter;

import java.util.Objects;

public class Dog extends Animal {

    private String sportTrained;

    public Dog(String name, String breed, int age, String healthStatus, String adoptionStatus, String sportTrained) {
        super(name, breed, age, healthStatus, adoptionStatus);
        this.sportTrained = sportTrained;
    }

    @Override
    public String toString() {
        return  super.toString() + "Dog{" +
                "sportTrained='" + sportTrained + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(sportTrained, dog.sportTrained);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sportTrained);
    }
}
