public class Waiter extends Person implements Worker {
    private int tableCount;
    private String shift;

    public Waiter(String name, int id, int tableCount, String shift) {
        super(name, id);
        this.tableCount = tableCount;
        this.shift = shift;
    }

    public int getTableCount() { return tableCount; }
    public String getShift() { return shift; }

    @Override
    public void performDuties() {
        System.out.println("Waiter " + getName() + " is serving " + tableCount + " tables during " + shift + " shift.");
    }

    @Override
    public void displayInfo() {
        System.out.println("--- Waiter ---");
        super.displayInfo();
        System.out.println("Tables     : " + tableCount);
        System.out.println("Shift      : " + shift);
    }
}
