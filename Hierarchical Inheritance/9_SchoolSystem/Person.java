public class Person {
    private String name;
    private int age;
    private String email;

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getEmail() { return email; }

    public void displayRole() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
        System.out.println("Email: " + email);
    }
}
