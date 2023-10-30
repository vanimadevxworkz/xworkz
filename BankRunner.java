package com.xworkz.test.driver;

import com.xworkz.test.things.Bank;
import com.xworkz.test.things.FD;
import com.xworkz.test.things.Account;
import com.xworkz.test.things.Online;
import com.xworkz.test.things.Payment;
import com.xworkz.test.things.RD;


public class BankRunner {
	public static void main(String args[]) {
		Bank bank=new Bank();
		bank.setName("HDFC");
		bank.setFounded("22.2.22");
		bank.setManger("ppp");
		
		System.out.println(bank.getName());
		System.out.println(bank.getFounded());
		System.out.println(bank.getManger());
		
		
		Online online=new Online();
		online.setAppName("mintra");
		online.setAmount(100);
		online.isPayment(true);
		
		Payment payment=new Payment();
		payment.setPaymentMode("online");
		payment.setPayment(false);
		payment.setPayAmount(200);
		
		Account account=new Account();
		account.setAccountName("canara");
		account.setAccountNumber(123456789l);
		account.setStartDate("9 11 2012");
		
		FD fd=new FD();
		fd.setStartDate("12 3 2022");
		fd.setFdNumber(234);
		fd.setPeriods(2);
		
		RD rd=new RD();
		rd.setRdNumber(543);
		rd.setStartDate("9 3 2021");
		rd.setPeriods(5);
		
		
		
		bank.setOnline(online);
		System.out.println(bank.getOnline().getAppName());
		System.out.println(bank.getOnline().getAmount());
		System.out.println(bank.getOnline().isPayment());
		
		bank.setPayment(payment);
		System.out.println(bank.getPayment().getPaymentMode());
		System.out.println(bank.getPayment().isPayment());
		System.out.println(bank.getPayment().getPayAmount());
		
		bank.setAccount(account);
		System.out.println(bank.getAccount().getAccountName());
		System.out.println(bank.getAccount().getAccountNumber());
		System.out.println(bank.getAccount().getStartDate());
		
		bank.setFd(fd);
		System.out.println(bank.getFd().getStartDate());
		System.out.println(bank.getFd().getFdNumber());
		System.out.println(bank.getFd().getPeriods());
		 
		bank.setRd(rd);
		System.out.println(bank.getRd().getRdNumber());
		System.out.println(bank.getRd().getStartDate());
		System.out.println(bank.getRd().getPeriods());
		
	}

}
