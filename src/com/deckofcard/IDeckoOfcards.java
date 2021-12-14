package com.deckofcard;

public interface IDeckoOfcards {
	
	String[] SUITS = {"CLUBS", "DIAMOND", "HEARTS", "SPADES"};
	String[] RANKS = {"2", "3","4","5","6","7","8","9","10","J","Q","K","A" };

	public  void init ();
	
	public void suffle();
	
	
	public void distribute();	
	
	public void  Print();
	
	public void PrintDistributedCards();
}

