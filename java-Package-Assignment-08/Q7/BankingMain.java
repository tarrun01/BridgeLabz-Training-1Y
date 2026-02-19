import com.bank.util.InterestCalculator;
import static java.lang.Math.*;

public class BankingMain {
    public static void main(String[] args) {
        InterestCalculator calc = new InterestCalculator();

        double principal = 50000.0;
        double rate      = 8.5;
        double time      = 5.0;

        System.out.println("========== Banking Interest Calculator ==========");
        System.out.printf("Principal  : ₹%.2f%n", principal);
        System.out.printf("Rate       : %.1f%%%n", rate);
        System.out.printf("Time       : %.0f years%n%n", time);

        // Simple Interest
        double si = calc.calculateSimpleInterest(principal, rate, time);
        System.out.printf("Simple Interest (SI)      : ₹%.2f%n", si);
        System.out.printf("Total Amount (SI)         : ₹%.2f%n%n", principal + si);

        // Compound Interest – using static import of pow() directly here for demo
        double ci = principal * pow(1 + rate / 100.0, time) - principal;
        System.out.printf("Compound Interest (CI)    : ₹%.2f%n", ci);
        System.out.printf("Total Amount (CI)         : ₹%.2f%n%n", principal + ci);

        // Extra static Math usages
        System.out.println("--- Additional Math Demos (static import) ---");
        System.out.printf("sqrt(principal)           : %.4f%n", sqrt(principal));
        System.out.printf("log(principal)            : %.4f%n", log(principal));
        System.out.printf("abs(-1234.56)             : %.2f%n", abs(-1234.56));
        System.out.printf("max(SI, CI)               : ₹%.2f%n", max(si, ci));
        System.out.printf("ceil(CI)                  : ₹%.0f%n", ceil(ci));
    }
}
