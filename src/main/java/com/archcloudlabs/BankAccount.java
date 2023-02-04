package com.archcloudlabs;

// abstract class because we don't instantiate any object for Bank Account
// nor do we want to.
public abstract class BankAccount {

    AccountTypes accountType;
    int accountID;
    String accountHolderName;
    double value;
    double interestRate;

    /**
     * Constructor to create bank accounts
     * 
     * @param accountType, type of account to create
     * @param accountID, account ID
     * @param accountHolderName  Name of account holder
     * @param value amount of money in account
     */
    public BankAccount(AccountTypes accountType, int accountID, String accountHolderName, double value) {
        this.accountType = accountType;
        this.accountID = accountID;
        this.accountHolderName = accountHolderName;
        this.value = value;
    }

    // abstract method that *MUST* be created in the child classes
    public abstract String accountCreationDate();

    // Get TYPE of account (this gets our enum AccountTypes)
    public AccountTypes getAccountType() {
        return accountType;
    }

    /**
     * Get "account ID" random double value.
     * @param N/A
     * 
     * @return double, account ID
     */
    public double getAccountID() {
        return accountID;
    }

    /**
     * Get account holder name 
     * 
     * @return String value for name of the accounter holder
     */
    public String getAccountHolderName() {
        return accountHolderName;
    }

    /**
     * Set account holder name
     * 
     * @param accountHolderName name for account holder
     */
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    /**
     * set the interest rate based on the account type
     */
    public void setInterestRate(){
        // this is leveraging the getAccountType method from the parent class,
        // getAccountType returns an enum of AccountType. We'll call a method in AccountTypes to get the interest rate.
        this.interestRate = this.getAccountType().getAccountTypeInterestRate();
    }

    /**
     * Get the accounts value
     * 
     *  @return get monetary value
     */
    public double getValue() {
        return value;
    }


    /**
     * Set the numeric value for the bank account.
     * 
     * @param value set the account's value
     */
    public void setValue(double value) {
        this.value = value;
    }
}
