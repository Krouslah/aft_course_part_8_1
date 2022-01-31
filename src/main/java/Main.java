import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("каша", "дом", "10");
        Cat cat = new Cat("сухой корм", "дом","перс");
        Horse horse = new Horse("трава", "стойло", 40);
        List<Animal> array = new ArrayList<>();
        array.add(dog);
        array.add(cat);
        array.add(horse);
        array.forEach(Vet::treatAnimal);
    }
}
