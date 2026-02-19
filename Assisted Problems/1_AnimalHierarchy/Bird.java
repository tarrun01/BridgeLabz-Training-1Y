public class Bird extends Animal {
    private double wingSpan;

    public Bird(String name, int age, double wingSpan) {
        super(name, age);
        this.wingSpan = wingSpan;
    }

    public double getWingSpan() { return wingSpan; }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Tweet! Tweet!");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Wing Span: " + wingSpan + " cm");
    }
}
