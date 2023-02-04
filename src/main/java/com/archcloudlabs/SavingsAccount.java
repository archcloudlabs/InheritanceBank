package com.archcloudlabs;

public class SavingsAccount extends BankAccount{

    public SavingsAccount(AccountTypes accountType, int accountID, String accountHolderName, double value) {
        super(accountType, accountID, accountHolderName, value);
    }

    /**
     * We're overriding a method in the child class CheckingAccount
     */
    @Override
    public String getAccountHolderName() {
        return "[OVERRIDDEN IN SAVINGS]" + accountHolderName ;
    }

    // overriding the abstract method from the parent class
    @Override
    public String accountCreationDate() {
        return "1999-08-23";
    }

    @Override
    public String toString() {
        return String.format("[Type:%s-%d] %s: %f", accountType, accountID, accountHolderName, (value * accountType.getAccountTypeInterestRate()));
    }

}