import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("========= Password Strength Validator =========\n");

        List<String> passwords = Arrays.asList(
            "abc",
            "password",
            "Password1",
            "P@ssword1",
            "SecureP@ss123"
        );

        for (String pwd : passwords) {
            System.out.println("Password : " + pwd);
            System.out.println("Length OK: " + SecurityUtils.isValidLength(pwd));
            System.out.println("Strength : " + SecurityUtils.checkPasswordStrength(pwd));
            System.out.println();
        }
    }
}
