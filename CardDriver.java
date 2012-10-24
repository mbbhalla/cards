package com.cards;

public class CardDriver {
	public static void main(String[] args) {
		CardDeck deck = new CardDeck();
		deck.shuffle(true);
		try {
			System.out.println(deck.deal(15)); //return 5 cards
			
		} catch(Exception e) {
			System.out.println(e);
		}
		
	}
}
