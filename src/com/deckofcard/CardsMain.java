package com.deckofcard;

public class CardsMain {

	public static void main(String[] args) {
		IDeckoOfcards deckOfCard = new DeckOfCards();
		deckOfCard.suffle();
		System.out.println(" ----------------------after Shuffle " );
		 deckOfCard.Print();
		 
		 deckOfCard.distribute();
		 deckOfCard.PrintDistributedCards();
	}

}
