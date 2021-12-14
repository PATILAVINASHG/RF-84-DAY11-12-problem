package com.stockmanagement;

import java.util.Scanner;

public interface StockManagement  {
	
	String [] STOCKS = new String[10];
	int [] SHAREPRICE = new int [10];
	int []NUMOFSHAR = new int [10];
	int []STOCKVALUE = new int [10];
	//public static final int NUMOFSHAR  = 0;
	
	public  void init ();
	
	public void claculatepriceofStocks();
	
	public void did();

	public void totalStockValue();
	
	
	
	}


