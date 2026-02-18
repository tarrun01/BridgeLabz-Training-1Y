public class OTPGenerator {
    static int generateOTP() {
        return 100000 + (int) (Math.random() * 900000);
    }

    static boolean areAllUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];
        System.out.println("Generated OTPs:");
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println("OTP " + (i + 1) + " = " + otps[i]);
        }
        System.out.println("All OTPs are unique: " + areAllUnique(otps));
    }
}
