public interface Vehicle {
    void rent(String customerName, int days);
    void returnVehicle(String customerName);
    String getVehicleInfo();
}
