package com.javahongkong.bootcamp.exercise;

public class ConsumerAccount extends Account{
	private Person person;
	private Long accountNumber;
	private int pin;
	double currentBalance;

	public ConsumerAccount(Person person, Long accountNumber, int pin, double currentBalance) {
		// complete the function
		super(person,accountNumber,pin,currentBalance);
	}

}