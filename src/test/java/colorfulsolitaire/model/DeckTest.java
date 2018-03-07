/*
 * This is the junit test class for the methods in Deck. The tests are to show that each
 * method is performing its correct function.
 */

package colorfulsolitaire.model;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;

public class DeckTest
{
   //Tests to make sure fill method runs properly
   @Test
   public void testFill()
   {
      Deck deck1 = new Deck();
      deck1.fill();
      int s = deck1.getSize();
      assertTrue(s == 52);
   }
   
   //Tests to make sure shuffle method runs properly
   @Test
   public void testShuffle()
   {
      int notSame = 0;
      Deck deck1 = new Deck();
      Deck sdeck = new Deck();
      deck1.fill();
      sdeck.fill();
      sdeck.shuffle();
      for(int i = 0; i < deck1.getSize(); i++){
         if(deck1.deal() != sdeck.deal()){
            notSame++;
         }
      }
      assertTrue(notSame != 0);
   }
   
   //Tests to make sure clear method runs properly
   @Test
   public void testClear()
   {
      Deck deck1 = new Deck();
      deck1.fill();
      deck1.clear();
      assertTrue(deck1.getSize() == 0);
   }
   
   //Tests to make sure deal method runs properly
   @Test
   public void testDeal(){
      Deck deck1 = new Deck();
      deck1.fill();
      deck1.deal();
      assertTrue(deck1.getSize() == 51);
      //shows that exactly 1 card has been dealt therefore
      //only 51 cards should be in deck
   }
   
   //Tests to make sure add method runs properly
   @Test
   public void testAdd(){
      Deck deck1 = new Deck();
      Card c = new Card(Rank.Queen, Suit.Hearts);
      deck1.add(c);
      assertFalse(deck1.getSize() == 0);
   }
   
   //Tests for case where deal is called on empty deck
   @Test
   public void testDealFail(){
      Deck deck1 = new Deck();
      boolean thrown = false;

      try {
        deck1.deal();
      } 
      catch (EmptyStackException e) {
        thrown = true;
      }
      assertTrue(thrown);
    }

}
