/**
 * Q3 – Static Import Demonstration
 *
 * Demonstrates at least five static methods from java.lang.Math using static import.
 *
 * WHY static import is useful:
 *   - Reduces verbosity: write sqrt() instead of Math.sqrt()
 *   - Makes math-heavy code more readable (e.g., scientific / financial formulae)
 *
 * WHEN to avoid static import:
 *   - When it causes name conflicts with local/other static members
 *   - When it harms readability by hiding where a method comes from
 *   - Overusing it across many classes makes maintenance harder
 */
import static java.lang.Math.*;

public class StaticImportDemo {
    public static void main(String[] args) {
        double num = 144.0;
        System.out.println("=== Static Import – Math Methods Demo ===\n");

        // 1. sqrt()
        System.out.println("1. sqrt(" + num + ")       = " + sqrt(num));

        // 2. pow()
        System.out.println("2. pow(2, 10)            = " + pow(2, 10));

        // 3. max()
        System.out.println("3. max(56, 89)           = " + max(56, 89));

        // 4. min()
        System.out.println("4. min(56, 89)           = " + min(56, 89));

        // 5. abs()
        System.out.println("5. abs(-73.5)            = " + abs(-73.5));

        // 6. ceil()
        System.out.println("6. ceil(4.3)             = " + ceil(4.3));

        // 7. floor()
        System.out.println("7. floor(4.9)            = " + floor(4.9));

        // 8. log()
        System.out.println("8. log(E)                = " + log(E));

        // 9. PI constant
        System.out.printf("9. PI                    = %.5f%n", PI);

        // 10. round()
        System.out.println("10. round(3.7)           = " + round(3.7));
    }
}
