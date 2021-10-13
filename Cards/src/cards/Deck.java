package cards;

import java.util.Random;

public class Deck {
	private Card[] Cards;

	public Deck() {
		this.Cards = new Card[52];
		String[] ranks = { "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen",
				"King", "Ace" };
		String[] suits = { "club", "diamond", "heart", "spade" };
		int deckPos = 0;

		for (String suit : suits) {
			for (int i = 0; i < ranks.length; i++) {
				String color = "Red";
				if (suit == "club" || suit == "spade") {
					color = "Black";
				}
				Card card = new Card(color, ranks[i], suit, i + 2, true);
				this.Cards[deckPos] = card;
				deckPos++;
			}
		}
	}
	
	public Deck(String[] suits, String[] ranks, boolean aceLow) {
		
	}

	public Card[] getCards() {
		return this.Cards;
	}
	
	public Card getCardAt(int i) {
		return this.Cards[i];
	}
	
	public void shuffle() {
		Random rand = new Random();
		for (int i = 0; i < this.Cards.length; i++) {
			int randToSwap = rand.nextInt(this.Cards.length);
			Card temp = this.Cards[randToSwap];
			this.Cards[randToSwap] = this.Cards[i];
			this.Cards[i] = temp;
		}
	}
}
