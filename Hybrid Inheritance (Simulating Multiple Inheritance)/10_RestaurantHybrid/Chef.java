public class Chef extends Person implements Worker {
    private String specialty;
    private int experienceYears;

    public Chef(String name, int id, String specialty, int experienceYears) {
        super(name, id);
        this.specialty = specialty;
        this.experienceYears = experienceYears;
    }

    public String getSpecialty() { return specialty; }
    public int getExperienceYears() { return experienceYears; }

    @Override
    public void performDuties() {
        System.out.println("Chef " + getName() + " is preparing " + specialty + " dishes in the kitchen.");
    }

    @Override
    public void displayInfo() {
        System.out.println("--- Chef ---");
        super.displayInfo();
        System.out.println("Specialty  : " + specialty);
        System.out.println("Experience : " + experienceYears + " years");
    }
}
