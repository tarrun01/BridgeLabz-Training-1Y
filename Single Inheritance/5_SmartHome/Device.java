public class Device {
    private String deviceId;
    private String status;

    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public String getDeviceId() { return deviceId; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status   : " + status);
    }
}
