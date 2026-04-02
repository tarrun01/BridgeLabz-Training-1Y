package com.gla.WrapperLvl1;
import java.util.Scanner;

public class PrimitiveToWrapper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int primitiveValue = sc.nextInt();

        Integer wrapperValue = Integer.valueOf(primitiveValue);

        System.out.println("Primitive int: " + primitiveValue);
        System.out.println("Integer object: " + wrapperValue);

        sc.close();
    }
}
