package com.eviro.assessment.grad001.simcarmahlangu.Model;

import java.math.BigDecimal;

public class CurrentAccount extends SavingsAccount {
    private int currentAccId;
    private BigDecimal overdraft;
    
    public CurrentAccount(int currentAccId, int savingsAccId, String accountNum,String customerNum, BigDecimal balance, BigDecimal overdraft){
        super(savingsAccId,accountNum,customerNum,balance);
        this.currentAccId = currentAccId;
        this.overdraft = overdraft;
    }

    public CurrentAccount() {
        
    }

    public int getCurrentAccId() {
        return currentAccId;
    }

    public void setCurrentAccId(int currentAccId) {
        this.currentAccId = currentAccId;
    }

    public BigDecimal getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(BigDecimal overdraft) {
        this.overdraft = overdraft;
    }
}
