package com.cg.service;

import com.cg.dao.BankDao;
import com.cg.dao.BankDaoImpl;
import com.cg.pojo.CustomerDetails;

public class BankServiceImpl implements BankService {

	BankDao dao = new BankDaoImpl();
	
	@Override
	public int withdraw(int accountNumber, int amount) {
		return (int) dao.withdraw(accountNumber,amount);
	}
	
	@Override
	public int deposit(int accountNumber, int amount) {
		return dao.deposit(accountNumber, amount);
	}
	
}
