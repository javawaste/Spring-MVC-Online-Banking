package com.cg.dao;

import com.cg.pojo.CustomerDetails;

public class BankDaoImpl implements BankDao {

	CustomerDetails customer;
	
	public double withdraw(int accountNumber,int amount) {
		double value=customer.getBalanceBefore();
		if(value>customer.getAmount()) {
			return (value - customer.getAmount());
		}
		return 0;
	}
	
	@Override
	public int deposit(int accountNumber, int amount) {
		int value=(int) customer.getBalanceBefore();
		value=(int) (value + customer.getAmount());
	    return value;
	}
}



