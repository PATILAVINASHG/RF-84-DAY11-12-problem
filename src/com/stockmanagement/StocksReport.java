package com.stockmanagement;

import java.util.Scanner;

public class StocksReport {

	public static void main(String[] args) {
		
		StockManagement ob1 = new Stocks();
		ob1.init();
		ob1.claculatepriceofStocks();
		ob1. totalStockValue();
	}
		
}
