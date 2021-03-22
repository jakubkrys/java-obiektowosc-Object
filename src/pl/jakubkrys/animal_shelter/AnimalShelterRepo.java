package pl.jakubkrys.animal_shelter;

public class AnimalShelterRepo {

    private Animal[] animals = new Animal[100];
    private int index = 0;

    public void add(Animal animal) {
        if (index < animals.length && !exist(animal)) {
            animals[index++] = animal;
        }
    }

    private boolean exist(Animal animal) {
        for (int i = 0; i < index; i++) {
            if (animals[i].equals(animal)){
                return true;
            }
        }
        return false;
    }

    public void displayAll(){
        for (int i = 0; i < index; i++) {
            System.out.println(animals[i]);
        }
    }
}
