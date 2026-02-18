public class Person {
    String name;
    int age;
    String city;

    Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    Person(Person other) {
        this.name = other.name;
        this.age = other.age;
        this.city = other.city;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", City: " + city);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Alice", 30, "Mumbai");
        Person p2 = new Person(p1);
        p1.display();
        p2.display();
        System.out.println("Are they the same object? " + (p1 == p2));
    }
}
