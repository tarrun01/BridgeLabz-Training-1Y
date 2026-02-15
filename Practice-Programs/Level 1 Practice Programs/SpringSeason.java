public class SpringSeason {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java SpringSeason <month> <day>");
            System.out.println("Example: java SpringSeason 4 15");
            return;
        }
        
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
        
        boolean isSpring = false;
        
        // Spring Season is from March 20 to June 20
        if (month == 3 && day >= 20) {
            isSpring = true;
        } else if (month == 4 || month == 5) {
            isSpring = true;
        } else if (month == 6 && day <= 20) {
            isSpring = true;
        }
        
        if (isSpring) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
