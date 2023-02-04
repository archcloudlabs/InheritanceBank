package com.archcloudlabs;

public class CheckingAccount extends BankAccount{

    boolean checks;

    /**
     * 
     * @param accountType type of accoun tfrom the AccountType enum
     * @param accountID unique account identifier
     * @param accountHolderName name of the account holder
     * @param value amount of money in the account
     */
    public CheckingAccount(AccountTypes accountType, int accountID, String accountHolderName, double value) {
        super(accountType, accountID, accountHolderName, value); // The super indicates its from the parent class
    }


    /**
     * Overriding the abstract method with a hardcoded creation date
     */
    @Override
    public String accountCreationDate() {
        return "1999-01-01";
    }


    /**
     * Put in a request to get checks in the mail
     * this is only in the CheckingAccount class
     * 
     * @return boolean indicating checks have been requests.
     */
    public void requestChecks() {
        this.checks = true;
    }

    /**
     * We're overriding a method in the child class CheckingAccount
     */
    @Override
    public String getAccountHolderName() {
        return "[OVERRIDDEN IN CHECKING]" + accountHolderName ;
    }

    /**
     * We're overriding a method in the child class CheckingAccount.
     */
    @Override
    public String toString() {
        return String.format("[Type:%s-%d] %s: %f\nChecks: %b", accountType, accountID, accountHolderName, (value * accountType.getAccountTypeInterestRate()), this.checks);
    }
   
}
