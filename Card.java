package com.cards;

import com.cards.CardConstants;

/*
 * represents a Card
 * contains: suite and rank
 */

public class Card {
	
	private short suite = 0;
	private short rank = 0;
	
	Card(short suite, short rank) {
		this.suite = suite;
		this.rank = rank;
	}
	
	public String toString() {
		String  suite = "";
		if(this.suite == CardConstants.SUITE_CLUB) {
			suite = "clubs";
		} else if(this.suite == CardConstants.SUITE_SPADE) {
			suite = "spades";
		} else if(this.suite == CardConstants.SUITE_DIAMOND) {
			suite = "diamonds";
		} else if(this.suite == CardConstants.SUITE_HEART) {
			suite = "hearts";
		} 
		
		String rank = "";
		if(this.rank > 10) {
			if(this.rank == CardConstants.RANK_ACE) {
				rank = "ace";
			} else if(this.rank == CardConstants.RANK_JACK) {
				rank = "jack";
			} else if(this.rank == CardConstants.RANK_QUEEN) {
				rank = "queen";
			} else if(this.rank == CardConstants.RANK_KING) {
				rank = "king";
			}
		} else {
			rank = Short.toString(this.rank);
		}
		
		return rank + " of " + suite;
	}
}
