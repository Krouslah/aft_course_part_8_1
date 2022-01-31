public class Dog extends Animal{
    private String weight;

    public Dog(String food, String location, String weight) {
        super(food, location);
        this.weight = weight;
    }

    @Override
    public void makeNoise(Animal animal) {
        System.out.println("woof");
    }

    @Override
    public void eat(Animal animal) {
        System.out.println("Ест" + this.getFood());
    }
}
