package com.deckofcard;

public class DeckOfCards implements IDeckoOfcards {

	private String[] decks = new String[52];
	private String[][] playerCards = new String[4][9];
	private int distributedIndex;
	public DeckOfCards () {
			init();
		
	 	}
	
	
	@Override
	public void init() {
		for (int i = 0; i < decks.length; i++) {
			decks[i] = RANKS[i%13] + SUITS[i /13];
			
		}
	}

	@Override
	public void suffle() {
		for (int i = 0; i  < decks.length; i++) {
			int randomIndex = (int)(Math.random() * decks.length);
			String temp = decks[i];
			decks[i] = decks[randomIndex];
			decks[randomIndex] =  temp;
		}
		
	}

	@Override
	public void distribute() {
		for (int j= 0; j < 9; j++) {
			for (int i = 0; i < 4; i++) {
				
				playerCards[i][j] = decks[distributedIndex++];
			}
		}
		distributedIndex = 0;
	}

	public void Print() {
		for (int i = 0; i < decks.length ; i++) {
		System.out.println(decks[i]);
		}
	
	}

	public void PrintDistributedCards() {
		
		 
			for (int i = 0; i < 4; i++) {
				for (int j= 0; j < 9; j++){
					System.out.print(playerCards[i][j] + "    ");
			}
			System.out.println("\n");
		}
	}
	

}
