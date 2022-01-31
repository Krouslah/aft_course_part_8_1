public class Animal {
    private String food;
    private String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }
    public void makeNoise(Animal animal){
        System.out.println(this.getClass().toString() + "издает звук");
    }
    public void eat(Animal animal){
        System.out.println(this.getClass().toString() + "ест");
    }
    public void sleep(Animal animal){
        System.out.println(this.getClass().toString() + "спит");
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }
}
