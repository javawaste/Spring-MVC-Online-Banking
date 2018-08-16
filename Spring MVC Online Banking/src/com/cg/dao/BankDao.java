package com.cg.dao;

public interface BankDao {

	public abstract double withdraw(int accountNumber,int amount);
	public abstract int deposit(int accountNumber,int amount);
}
