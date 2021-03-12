package com.eviro.assessment.grad001.simcarmahlangu;

import com.eviro.assessment.grad001.simcarmahlangu.Exceptions.AccountNotFoundException;
import com.eviro.assessment.grad001.simcarmahlangu.Exceptions.WithdrawalAmountTooLargeException;
import com.eviro.assessment.grad001.simcarmahlangu.Service.Service;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws WithdrawalAmountTooLargeException, AccountNotFoundException {
	// write your code here
        Service service = new Service();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter account number: ");
        String accountNumber = scan.nextLine();

        System.out.println("Enter amount to withdraw: ");
        BigDecimal amountToWithdraw = scan.nextBigDecimal();
        
        service.withdraw(accountNumber, amountToWithdraw);
    }
}
