public class OnlineCourse extends Course {
    private String platform;
    private boolean isRecorded;

    public OnlineCourse(String courseName, int durationWeeks, String instructor,
                        String platform, boolean isRecorded) {
        super(courseName, durationWeeks, instructor);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    public String getPlatform() { return platform; }
    public boolean isRecorded() { return isRecorded; }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Platform   : " + platform);
        System.out.println("Recorded   : " + isRecorded);
    }
}
