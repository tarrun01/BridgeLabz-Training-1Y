package com.gla.WrapperLvl2;
public class BankTransactionLimit {

    public static double getRemainingLimit(Double limit, double amountWithdrawn) {
        if (limit == null) {
            return 0.0;
        }
        return limit - amountWithdrawn;
    }

    public static void main(String[] args) {
        Double limit1 = 5000.0;
        Double limit2 = null;

        System.out.println("Remaining limit (valid): " + getRemainingLimit(limit1, 1500.0));
        System.out.println("Remaining limit (null):  " + getRemainingLimit(limit2, 1500.0));
    }
}
