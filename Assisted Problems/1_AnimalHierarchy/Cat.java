public class Cat extends Animal {
    private boolean isIndoor;

    public Cat(String name, int age, boolean isIndoor) {
        super(name, age);
        this.isIndoor = isIndoor;
    }

    public boolean isIndoor() { return isIndoor; }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow! Meow!");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Indoor Cat: " + isIndoor);
    }
}
