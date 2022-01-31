public class Cat extends Animal{
    private String breed;

    public Cat(String food, String location, String breed) {
        super(food, location);
        this.breed = breed;
    }

    @Override
    public void makeNoise(Animal animal) {
        System.out.println("MYAU");
    }

    @Override
    public void eat(Animal animal) {
        System.out.println("Ест " + this.getFood());
    }
}
