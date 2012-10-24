package com.cards;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * Represents a collection of 52 cards
 */

public class CardDeck {
	
	/*
	 * using List collection because:
	 * 1. a deck order is necessary
	 * 2. ArrayList is optimized for index based access and put and 
	 * 	  we do that a lot in shuffle
	 */
	List<Card> deck = null;
	
	CardDeck() {
		deck = new ArrayList<Card>();
		
		//add cards to Deck
		for(short i = 0; i < 52; i++) {
			
			short rank = (short)((i % 13) + 2);
			
			if(i >= 0 && i < 13) {
				deck.add(new Card(CardConstants.SUITE_CLUB, rank));
			} else if(i >= 13 && i < 26) {
				deck.add(new Card(CardConstants.SUITE_HEART, rank));
			} else if(i >= 26 && i < 39) {
				deck.add(new Card(CardConstants.SUITE_DIAMOND, rank));
			} else if(i >= 39 && i < 52) {
				deck.add(new Card(CardConstants.SUITE_SPADE, rank));
			}
		}
	}
	
	/*
	 * shuffles the card deck
	 */
	private void shuffle(int limit) {
		for(short i = 0; i < limit; i++) { 
		    Random randomGenerator = new Random();
		    int replace = randomGenerator.nextInt(limit) + (limit == 26 ? 26: 0);
		    Card cardI = deck.get(i);
		    deck.set(i, deck.get(replace));
		    deck.set(replace, cardI);
		}
	}
	
	/*
	 * optimized as if shuffles only half the deck at a time
	 * with cards from other half
	 */
	public void shuffle(boolean half) {
		shuffle(26);
	}
	
	public void shuffle() {
		shuffle(52);
	}
	
	public List<Card> deal(int n) throws Exception {
		if(n <= 0 || n > 52) {
			throw new Exception("invalid deal method argument range");
		}
		return deck.subList(0, n);
	}
	
}
