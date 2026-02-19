public class Developer extends Employee {
    private String programmingLanguage;
    private String experienceLevel;

    public Developer(int id, String name, double salary, String programmingLanguage, String experienceLevel) {
        super(id, name, salary);
        this.programmingLanguage = programmingLanguage;
        this.experienceLevel = experienceLevel;
    }

    public String getProgrammingLanguage() { return programmingLanguage; }
    public String getExperienceLevel() { return experienceLevel; }

    @Override
    public void displayDetails() {
        System.out.println("--- Developer ---");
        super.displayDetails();
        System.out.println("Language  : " + programmingLanguage);
        System.out.println("Experience: " + experienceLevel);
        System.out.println();
    }
}
