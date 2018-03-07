/*
 * This class implements the Deck object as well as provides functions for the
 * manipulation and executions of Decks.
 */
package colorfulsolitaire.model;

import java.util.*;

public class Deck{
   
   private Card card;
   
   //Constructor for Deck object
   public Deck(){
      deck = new ArrayList<Card>();
   }
   
   //This method adds a card to the deck until all possible cards are in the deck
   public void fill(){
      
      for (Suit s : Suit.values()){
         for (Rank r : Rank.values()){
            card = new Card(r, s);
            deck.add(card);
         }
      }
   }
   
   //This method randomizes the locations of the cards in a given deck
   public  void shuffle() {
       for (int i = deck.size(); i > 0; i--){
          int j = ran.nextInt(i);
          Card temp = deck.get(i - 1);
          deck.set(i -1, deck.get(j));
          deck.set(j, temp);
       }
    }
   
   //This method reveals the top card in a deck and returns it
   //If there are no cards left it reports an error
   public Card deal(){
      if (deck.size() > 0){
         Card c = deck.remove(deck.size()-1);
         return c;
      }
      else{
         System.out.println("You lose");
         EmptyStackException e = new EmptyStackException();
         throw e;
      }
   }
   
   //This method places a stated card into the given deck
   public void add(Card c){
      deck.add(c);   
   }
   
   public Card getTop(){
         if (deck.isEmpty()){
            throw new EmptyStackException();
         }
      return deck.get(deck.size() - 1);
   }
   
   //This method returns a true/false value to tell if the deck has no cards in it
   public boolean isEmpty(){
      
      return deck.isEmpty();
   }
   
   //This method iterates through the deck and removes each Card
   public void clear(){
      deck.clear();
      }
   
   //This method simply tells the caller how many cards are in the deck
   public int getSize(){
      return deck.size();
   }
   
   //This method returns the rank of the card
   public Rank getRank(Card c){
      return c.getRank();  
   }
   
   //This method will take the rank of a card and return its game value
   public int getCardValue(Card c){
      switch(c.getRank()){
      case Ace: return 1;
      case Two: return 2;
      case Three: return 3;
      case Four: return 4;
      case Five: return 5;
      case Six: return 6;
      case Seven: return 7;
      case Eight: return 8;
      case Nine: return 9;
      case Ten: return 10;
      case Jack: return 10;
      case Queen: return 10;
      case King: return 10;
      default: return 0;
      }
   }
   
   //This method returns the suit of the Card
   public Suit getSuit(Card c){
      return c.getSuit();
   }
   
   private ArrayList<Card> deck;
   private static Random ran = new Random();
   
}


