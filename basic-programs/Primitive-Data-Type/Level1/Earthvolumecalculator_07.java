//Author-Tarun Kumar Sec-AT Program-Btech CSE
//Date-18/01/2026; Last Edited Date-18/01/2026
//Purpose-Write a Program to compute the volume of Earth in km^3 and miles^3
public class Earthvolumecalculator_07 {
    public static void main(String[] args) {
        double radiusearth=6378;
        double earthvolume=1.3333*Math.PI*radiusearth*radiusearth*radiusearth;
        System.out.println(String.format("The volume of earth in cubic kilometers is %.2f and cubic miles is %.2f",earthvolume,(earthvolume*0.6213711922)));
    }
}
