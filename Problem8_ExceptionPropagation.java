public class Problem8_ExceptionPropagation {
    
    // Method 1 - throws ArithmeticException
    public static void method1() {
        int result = 10 / 0;  // This will throw ArithmeticException
        System.out.println("Result: " + result);
    }
    
    // Method 2 - calls method1()
    public static void method2() {
        method1();
    }
    
    // Main method - calls method2() and handles exception
    public static void main(String[] args) {
        try {
            method2();
        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }
}
