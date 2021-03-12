package com.eviro.assessment.grad001.simcarmahlangu.Interface;

import com.eviro.assessment.grad001.simcarmahlangu.Exceptions.AccountNotFoundException;
import com.eviro.assessment.grad001.simcarmahlangu.Exceptions.WithdrawalAmountTooLargeException;

import java.math.BigDecimal;

public interface AccountService {
    public void withdraw(String accountNum, BigDecimal amountToWithdraw) throws WithdrawalAmountTooLargeException, AccountNotFoundException;
}
