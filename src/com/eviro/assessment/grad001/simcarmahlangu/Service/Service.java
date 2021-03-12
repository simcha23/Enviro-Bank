package com.eviro.assessment.grad001.simcarmahlangu.Service;

import com.eviro.assessment.grad001.simcarmahlangu.Exceptions.AccountNotFoundException;
import com.eviro.assessment.grad001.simcarmahlangu.Exceptions.WithdrawalAmountTooLargeException;
import com.eviro.assessment.grad001.simcarmahlangu.Interface.AccountService;
import com.eviro.assessment.grad001.simcarmahlangu.Model.SavingsAccount;
import com.eviro.assessment.grad001.simcarmahlangu.Model.CurrentAccount;
import com.eviro.assessment.grad001.simcarmahlangu.SystemDB;

import java.math.BigDecimal;

public class Service implements AccountService {

    private final SystemDB systemDB;
    private final BigDecimal balance = new BigDecimal(1000);
    public Service(){
        this.systemDB = new SystemDB();
    }

    @Override
    public void withdraw(String accountNum, BigDecimal amountToWithdraw) throws WithdrawalAmountTooLargeException, AccountNotFoundException {


        if(systemDB.database().containsKey(accountNum)){

            CurrentAccount currentAccount = (CurrentAccount) systemDB.database().get(accountNum);
            SavingsAccount savingsAccount = (SavingsAccount) systemDB.database().get(accountNum);
            
            if(savingsAccount.getBalance().subtract(amountToWithdraw).compareTo(balance) >= 0){
                System.out.println("Your remaining balance: " + savingsAccount.getBalance().subtract(amountToWithdraw));
            }
            else if(currentAccount.getBalance().add(currentAccount.getOverdraft()).compareTo(amountToWithdraw)>= 0){
                System.out.println("Your remaining balance: " + currentAccount.getBalance().add(currentAccount.getOverdraft()).subtract(amountToWithdraw));
            }
            else{
                throw new WithdrawalAmountTooLargeException("Withdrawal Amount Too Large!");
            }

        }else {
            throw new AccountNotFoundException("Account not found!");
        }
    }
}
