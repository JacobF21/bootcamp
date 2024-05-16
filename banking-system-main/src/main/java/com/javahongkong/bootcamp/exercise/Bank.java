package com.javahongkong.bootcamp.exercise;

import java.util.LinkedHashMap;
import java.util.Map;

public class Bank implements BankInterface{
	private LinkedHashMap<Long, Account> accounts; // object reference
	static long number =0L;

	public Bank() {
		// complete the function
		this.accounts=new LinkedHashMap<Long, Account>();
	}

	public Account getAccount(Long accountNumber) {
		// complete the function
		for(Map.Entry<Long, Account> entry:this.accounts.entrySet()){
			if(entry.getKey()== accountNumber){
				return entry.getValue();
			}
		}
		return null;
	}

	public Long openCommercialAccount(Company company, int pin, double startingDeposit) {
		// complete the function
		number++;
		this.accounts.put(number,new CommercialAccount(company,number,pin,startingDeposit));
		return number;
	}

	public Long openConsumerAccount(Person person, int pin, double startingDeposit) {
		// complete the function
		number++;
		this.accounts.put(number,new ConsumerAccount(person,number,pin,startingDeposit));
		return number;
	}

	public boolean authenticateUser(Long accountNumber, int pin) {
		// complete the function
		return true;
	}

	public double getBalance(Long accountNumber) {
		// complete the function
		for(Map.Entry<Long, Account> entry:this.accounts.entrySet()){
			if(entry.getKey() == accountNumber){
				return entry.getValue().getBalance();
			}
		}
		return -1.0;
	}

	public void credit(Long accountNumber, double amount) {
		// complete the function
		for(Map.Entry<Long, Account> entry:this.accounts.entrySet()){
			if(entry.getKey() == accountNumber){
				entry.getValue().creditAccount(amount);
			}
		}
	}

	public boolean debit(Long accountNumber, double amount) {
		// complete the function
		for(Map.Entry<Long, Account> entry:this.accounts.entrySet()){
			if(entry.getKey() == accountNumber && amount<entry.getValue().getBalance()){
				entry.getValue().debitAccount(amount);
				return true;
			}
		}
		return false;
	}
}
