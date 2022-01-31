public class Horse extends Animal{
    private int speed;

    public Horse(String food, String location, int speed) {
        super(food, location);
        this.speed = speed;
    }

    @Override
    public void makeNoise(Animal animal) {
        System.out.println("PFFFFHRR");
    }

    @Override
    public void eat(Animal animal) {
        System.out.println("Ест" + this.getFood());
    }
}
