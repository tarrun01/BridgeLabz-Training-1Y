public interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}
