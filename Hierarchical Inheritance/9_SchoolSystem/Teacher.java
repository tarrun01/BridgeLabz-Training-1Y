public class Teacher extends Person {
    private String subject;
    private int experienceYears;

    public Teacher(String name, int age, String email, String subject, int experienceYears) {
        super(name, age, email);
        this.subject = subject;
        this.experienceYears = experienceYears;
    }

    public String getSubject() { return subject; }
    public int getExperienceYears() { return experienceYears; }

    @Override
    public void displayRole() {
        System.out.println("--- Teacher ---");
        super.displayRole();
        System.out.println("Subject    : " + subject);
        System.out.println("Experience : " + experienceYears + " years");
        System.out.println();
    }
}
