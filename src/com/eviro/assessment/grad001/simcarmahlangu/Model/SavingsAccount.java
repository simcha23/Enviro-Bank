package com.eviro.assessment.grad001.simcarmahlangu.Model;

import java.math.BigDecimal;

public class SavingsAccount {
    private int savingsAccId;
    private String accountNum;
    private String customerNum;
    private BigDecimal balance;

    public SavingsAccount(int savingsAccId, String accountNum,String customerNum, BigDecimal balance){
        this.savingsAccId = savingsAccId;
        this.accountNum = accountNum;
        this.balance = balance;
    }

    public SavingsAccount() {
        
    }


    public int getSavingsAccId() {
        return savingsAccId;
    }

    public void setSavingsAccId(int savingsAccId) {
        this.savingsAccId = savingsAccId;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public String getCustomerNum() {
        return customerNum;
    }
    
    public void setCustomerNum(String customerNum) {
        this.customerNum = customerNum;
    }

    public BigDecimal getBalance() { return balance; }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    
}
