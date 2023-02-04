package com.archcloudlabs;

public enum AccountTypes {
    SAVINGS(0.25),
    CHECKINGS(0.2),
    RETIREMENT(1.3),
    INVESTMENT(1.0);

    double interestRate;

    private AccountTypes(double interestRate) {
        this.interestRate = interestRate;

    }

    public double getAccountTypeInterestRate() {
        return this.interestRate;
    }
}