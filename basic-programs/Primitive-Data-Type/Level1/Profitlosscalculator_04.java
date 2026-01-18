//Author-Tarun Kumar Sec-AT Program-Btech CSE
//Date-18/01/2026; Last Edited Date-18/01/2026
//Purpose-Create a program to calculate the profit and loss in number and percentage 
// based on the cost price of INR 129 and the selling price of INR 191
public class Profitlosscalculator_04 {
    public static void main(String[] args) {
        double cp=129,sp=191;
        System.out.println("The Cost Price is INR "+cp+" and Selling Price is INR "+sp);
        double profitper=((sp-cp)*100)/cp;
        System.out.println(String.format("The Profit is INR "+(sp-cp)+" and the profit in Percentage is %.2f%n",profitper));
    }
}
