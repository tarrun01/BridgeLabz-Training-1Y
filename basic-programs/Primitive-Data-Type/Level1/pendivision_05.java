//Author-Tarun Kumar Sec-AT Program-Btech CSE
//Date-18/01/2026; Last Edited Date-18/01/2026
//Purpose-Suppose you have to divide 14 pens among 3 students equally. Write a program to find how many pens each student will get if the pens must be divided equally. Also, find the remaining non-distributed pens.
public class pendivision_05 {
    public static void main(String[] args) {
        int pens=14,students=3,penperstudent=0,remainingpen=0;

        penperstudent=pens/students;

        if (pens % students==0) {
           
            remainingpen=0;
        }
        else if (pens % students==1) {
           
             remainingpen=1;
        }
        else if (pens % students==2) {
            remainingpen=2;
        }
        System.out.println("The Pen Per Student is :"+penperstudent+" and the remaining pen not distributed is :"+remainingpen);
    }
}
