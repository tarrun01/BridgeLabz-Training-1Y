public class CircleConstructor {
    double radius;

    CircleConstructor() {
        this(1.0);
    }

    CircleConstructor(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    void display() {
        System.out.println("Radius: " + radius + ", Area: " + area());
    }

    public static void main(String[] args) {
        CircleConstructor c1 = new CircleConstructor();
        c1.display();
        CircleConstructor c2 = new CircleConstructor(5.0);
        c2.display();
    }
}
