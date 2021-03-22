package pl.jakubkrys.animal_shelter;

import java.util.Objects;

public class Cat extends Animal {

    private String adaptation;

    public Cat(String name, String breed, int age, String healthStatus, String adoptionStatus, String adaptation) {
        super(name, breed, age, healthStatus, adoptionStatus);
        this.adaptation = adaptation;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "adaptation='" + adaptation + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return Objects.equals(adaptation, cat.adaptation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), adaptation);
    }
}
