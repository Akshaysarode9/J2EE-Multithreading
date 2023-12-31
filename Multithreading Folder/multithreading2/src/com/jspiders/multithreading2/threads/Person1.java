package com.jspiders.multithreading2.threads;

import com.jspiders.multithreading2.resource.Account;

public class Person1 extends Thread {

	Account account;

	public Person1(Account account) {
		this.account = account;
	}

	@Override
	public void run() {
		account.depositAmount(5000);
		account.withdrawAmount(3000);
	}

}
