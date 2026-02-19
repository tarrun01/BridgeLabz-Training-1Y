public class UserProfile implements SensitiveData {
    private String username;
    private String email;
    private String phoneNumber;
    private String aadharNumber;

    public UserProfile(String username, String email, String phoneNumber, String aadharNumber) {
        this.username = username;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.aadharNumber = aadharNumber;
    }

    public String getUsername() { return username; }
    public String getEmail() { return email; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getAadharNumber() { return aadharNumber; }

    @Override
    public String toString() {
        return "UserProfile{username='" + username + "', email='" + email +
               "', phone='" + phoneNumber + "', aadhar='" + aadharNumber + "'}";
    }
}
