import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("woofy", true);
        Dog dog2 = new Dog("milo", false);
        Dog dog3 = new Dog("Tommy", true);
        Dog dog4 = new Dog("buzo", false);
        Dog dog5 = new Dog("Geronimo", false);

        Cat cat1 = new Cat("Frank");
        Cat cat2 = new Cat("Pinky");
        Cat cat3 = new Cat("Timothy");

        ArrayList<Pet> pets = new ArrayList<>();
        pets.addAll(Arrays.asList(dog1, dog2, dog3, dog4, dog5));
        pets.add(cat1);
        pets.add(cat2);

        for (Pet pet : pets)
        {
            System.out.printf("%s name: %s speak() returns: %s%n", pet.getClass(), pet.getName(), pet.speak());
        }
    }
}
