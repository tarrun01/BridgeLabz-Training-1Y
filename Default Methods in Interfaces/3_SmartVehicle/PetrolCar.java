public class PetrolCar implements VehicleDashboard {
    private String model;
    private double speed;

    public PetrolCar(String model, double speed) {
        this.model = model;
        this.speed = speed;
    }

    @Override
    public void displaySpeed() {
        System.out.println("[" + model + "] Current Speed: " + speed + " km/h | Fuel Type: Petrol");
    }
}
