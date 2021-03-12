package com.eviro.assessment.grad001.simcarmahlangu;
import com.eviro.assessment.grad001.simcarmahlangu.Model.CurrentAccount;
import com.eviro.assessment.grad001.simcarmahlangu.Model.SavingsAccount;


import java.math.BigDecimal;
import java.util.HashMap;

public class SystemDB {

    private static SystemDB systemDB_instance = null;

    public static SystemDB getInstance()
    {
        if (systemDB_instance == null)
            systemDB_instance = new SystemDB();

        return systemDB_instance;
    }

    
    HashMap<String, Object> accounts = new HashMap<String, Object>();
    public HashMap<String, Object> database(){

        accounts.put("10001", new SavingsAccount(101,"10001","001", new BigDecimal(2000)));
        accounts.put("10002", new SavingsAccount(102,"10002","001", new BigDecimal(5000)));
        accounts.put("10003", new CurrentAccount(103,101, "10003","003",new BigDecimal(5000), new BigDecimal(10000)));
        accounts.put("10004", new CurrentAccount(104,102,"10004","004", new BigDecimal(-5000), new BigDecimal(20000)));

        return accounts;
    }
}
