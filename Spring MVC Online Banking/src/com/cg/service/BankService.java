package com.cg.service;

import com.cg.pojo.CustomerDetails;

public interface BankService {

	//public abstract double withdraw(CustomerDetails customer);
	public abstract int deposit(int accountNumber, int amount);
	public abstract int withdraw(int accountNumber, int amount);
}
