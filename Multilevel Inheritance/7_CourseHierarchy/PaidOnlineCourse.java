public class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discountPercent;

    public PaidOnlineCourse(String courseName, int durationWeeks, String instructor,
                            String platform, boolean isRecorded, double fee, double discountPercent) {
        super(courseName, durationWeeks, instructor, platform, isRecorded);
        this.fee = fee;
        this.discountPercent = discountPercent;
    }

    public double getFee() { return fee; }
    public double getDiscountPercent() { return discountPercent; }

    public double getFinalFee() {
        return fee - (fee * discountPercent / 100);
    }

    @Override
    public void displayDetails() {
        System.out.println("--- Paid Online Course ---");
        super.displayDetails();
        System.out.printf("Fee        : ₹%.2f%n", fee);
        System.out.printf("Discount   : %.0f%%%n", discountPercent);
        System.out.printf("Final Fee  : ₹%.2f%n", getFinalFee());
        System.out.println();
    }
}
