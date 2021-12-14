package com.stockmanagement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Stocks implements StockManagement  {
	//private static final int NUMOFSHAR = 0;
	 String STOCKSLIST[];
		int i;
		
		  public Stocks() { 
			  init();
			  init();
		  }
	@Override
	public void init() {
		System.out.println("enter the stock name");
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("enetr the share price");
		
		int shareprice = sc1.nextInt();
		System.out.println("enetr the numof sahare");
		int numOfshare = sc1.nextInt();
		STOCKS [i] = str;
		SHAREPRICE[i] = shareprice;
		NUMOFSHAR[i] = numOfshare;
		
	 STOCKVALUE[i] = (int) (NUMOFSHAR[i]* SHAREPRICE[i]);
	//System.out.println("stockEachvalue"+ STOCKVALUE[i]);
	i++;
	
	
	}
	public void claculatepriceofStocks() 
	{ for (int i = 0; i < 3 ; i++) {
	  
	  System.out.println("STOCKLNAME -----=>"   + STOCKS[i]+ " --------    => "+"STOCKVALUE -----=>" + STOCKVALUE[i]+ " -----=>number of share : =>" +NUMOFSHAR[i] );
	  	
	} 
	}

	public void totalStockValue() {
		int TATOLSTOCKVALUE = 0;
		int TotalNumberOfStocks =0;
		for (int i = 0; i <= 3 ; i++) {
			int temp = STOCKVALUE [i];
				TATOLSTOCKVALUE = temp +  TATOLSTOCKVALUE;
				TotalNumberOfStocks +=  NUMOFSHAR[i] ; 
		}		
			System.out.println(" Total value of Stocks : -- =>"
					+ "" +TATOLSTOCKVALUE + "----------TotalNumberOfShare  : =>" + TotalNumberOfStocks  );
		}
	@Override
	public void did() {
		
	}
		
		
	}
	

	

