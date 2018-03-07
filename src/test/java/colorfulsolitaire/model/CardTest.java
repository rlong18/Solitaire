package colorfulsolitaire.model;
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
	
	@Test
   public void testflip() {
	   
      Card card1 = new Card(Rank.Ace, Suit.Spades);
      Card card2 = new Card(Rank.Jack, Suit.Diamonds, true);
      
      card1.flip();
      card2.flip();
      
      boolean res = card1.isFaceUp();
      boolean res2 = card2.isFaceUp();
      
      assertTrue(res == true);
      assertTrue(res2 == false);
   }
	
	@Test
	public void testRank(){
	   Card card1 = new Card(Rank.Ace, Suit.Spades);
	   Rank rank = card1.getRank();
	   assertTrue(rank == Rank.Ace);
	}

	@Test
   public void testSuit(){
      Card card1 = new Card(Rank.Ace, Suit.Spades);
      Suit suit = card1.getSuit();
      assertTrue(suit == Suit.Spades);
   }
	
	@Test
   public void testAbbrev() {
      Card card1 = new Card(Rank.Ace, Suit.Spades);
      Card card2 = new Card(Rank.Jack, Suit.Diamonds);
      Card card3 = new Card(Rank.Eight, Suit.Hearts);
      
      System.out.println(card1.getAbbrev());
      System.out.println(card2.getAbbrev());
      System.out.println(card3.getAbbrev());
      
      assertEquals("AS", card1.getAbbrev());
      assertEquals("JD", card2.getAbbrev());
      assertEquals("8H", card3.getAbbrev());
   }
	
}