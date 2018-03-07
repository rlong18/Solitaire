package csc232;

public class CardTestDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Card card1 = new Card(Rank.Ace, Suit.Spades);
		Card card2 = new Card(Rank.Jack, Suit.Diamonds);
		
		System.out.println(card1);
		System.out.println(card2);
	}

}

