package com.wbalance;

import java.util.Scanner;

public class Account {
	
	static  double balance = 200;
	
		Account(double initailbalance){
			
			if(initailbalance > 0.0) {
				
				balance = initailbalance;
			}
		}
static  void cridit(double amount ) {
	
	balance = balance + amount ;
	System.out.println(amount+ "Amount Addeded in your account \n" + "Total Balance is " + balance);
	}

public static void debit (double debitAmount) {
System.out.println(debitAmount);
	if (debitAmount > balance)
	{
		debitAmount = 0.0;
		System.out.println( "Debit amount exceeded account balance." );
	}
	
	balance = balance - debitAmount;
	}

static double getbalance() {
	
	
	return balance;
	
	}
public static void main(String[]args) {
	
	System.out.println("What do you want : \n " + "1 to credit the money\n" + "2 for widrow the money\n"+"3 Check the balance");
	Scanner obj = new Scanner(System.in);
	int choice = obj.nextInt();
	
	double  money  = obj.nextDouble() ;
	 
	switch (choice) {
	case 1:
		//System.out.println("How much you want to cridit");
		cridit(money);
		break;
	case 2:
		debit(money);
		break;
	case 3: 
		
		 System.out.println( "Your Account Balance is "+new Account(balance).getbalance());
		break;
		
	}
	}
}
