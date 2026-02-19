package com.bank.util;

public class InterestCalculator {

    /**
     * Simple Interest: SI = (P × R × T) / 100
     */
    public double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100.0;
    }

    /**
     * Compound Interest: CI = P × pow(1 + R/100, T) – P
     * Uses static import of Math.pow in the calling class.
     */
    public double calculateCompoundInterest(double principal, double rate, double time) {
        return principal * Math.pow(1 + rate / 100.0, time) - principal;
    }
}
