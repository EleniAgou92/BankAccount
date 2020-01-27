package bamkaccount;

import java.awt.List;

import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


import utilities.CSV;

public class BankAccountAppl {

	public static void main(String[] args) {
		List<Acccount> accounts=new LinkedList<Account>();
		String file = "C:\\Users\\User\\Documents\\NewBankAccount.csv";
		/*
		Checking chekacc1= new Checking("eleni","424",1500);
		Savings savacc1= new Savings("tom po","5656",2500);
		
		savacc1.compound();

		savacc1.showInfo();
		System.out.println("********");
		
		chekacc1.showInfo();
		savacc1.deposit(5000);
		savacc1.withdraw(200);
		savacc1.transfer("raf",3000);

	}*/
		//read CSV file and created accounts
		List<String[]> newAccountHolders = CSV.read(file);
		for (String[] accountHolder: newAccountHolders) {
			
			String name= accountHolder[0];
			String sSN=accountHolder[1];
			String accountType=accountHolder[1];
			double initDeposit= Double.parseDouble(accountHolder[3]);
			System.out.println(name+" "+sSN+" "+accountType + "$" +initDeposit);
			if(accountType.equals("Savings")) {
				System.out.println("OPEN SAVINGS ACCOUNT");
				accounts.add(new Savings(name,sSN,initDeposit));
			}
			else if (accountType.equals("Checking")){
				System.out.println("OPEN checkings ACCOUNT");
				accounts.add(new Checking(name,sSN,initDeposit));

			}else {
				System.out.println("Error reading account");
			}
			for (Account acc: accounts) {
				System.out.println("\n***********");
				acc.showInfo();
			}
		}
	

	}
}
