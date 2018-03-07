package csc232;
import static org.junit.Assert.*;

import org.junit.Test;


public class CardTest {

	@Test
	public void testToString() {
		Card card1 = new Card(Rank.Ace, Suit.Spades);
		Card card2 = new Card(Rank.Jack, Suit.Diamonds);
		
		assertEquals("Ace of Spades", card1.toString());
		assertEquals("Jack of Diamonds", card2.toString());
	}

}