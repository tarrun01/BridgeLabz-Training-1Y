public interface SecurityUtils {

    static String checkPasswordStrength(String password) {
        if (password == null || password.length() < 6) {
            return "WEAK - Password must be at least 6 characters.";
        }

        boolean hasUpper = password.chars().anyMatch(Character::isUpperCase);
        boolean hasLower = password.chars().anyMatch(Character::isLowerCase);
        boolean hasDigit = password.chars().anyMatch(Character::isDigit);
        boolean hasSpecial = password.chars().anyMatch(c -> "!@#$%^&*()_+-=[]{}".indexOf(c) >= 0);
        int length = password.length();

        int score = 0;
        if (hasUpper) score++;
        if (hasLower) score++;
        if (hasDigit) score++;
        if (hasSpecial) score++;
        if (length >= 12) score++;

        if (score <= 2) return "WEAK";
        if (score == 3) return "MODERATE";
        if (score == 4) return "STRONG";
        return "VERY STRONG";
    }

    static boolean isValidLength(String password) {
        return password != null && password.length() >= 8;
    }
}
