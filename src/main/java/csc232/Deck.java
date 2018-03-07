package csc232;
import java.util.*;

public class Deck{
	
	private Card card;
	
	
	public Deck(){
		deck = new ArrayList<Card>();
	}
	
	public void fill(){
		
		for (Suit s : Suit.values()){
			for (Rank r : Rank.values()){
				card = new Card(r, s);
				deck.add(card);
			}
		}
	}

	/*public void shuffle(){

		ArrayList<Card> sDeck = new ArrayList<Card>();
		Random ran = new Random();
		
		for (int i = 0; i < deck.size()-1; i++){
			int index = ran.nextInt(deck.size());
			card = deck.remove(index);
			sDeck.add(card);
		}
		deck = sDeck;
		
	}*/
	
	public  void shuffle() {
        ArrayList<Card> temp = new ArrayList<Card>();
        while(!deck.isEmpty()) {
            int loc=(int)(Math.random()*deck.size());
            temp.add(deck.get(loc));
            deck.remove(loc);   
        }
        deck=temp;
    }
	
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
	
	public void add(Card c){
		deck.add(c);
			
	}
		
		
	
	public boolean isEmpty(){
		
		if (deck.size() == 0){
			return true;
		}
		else return false;
	}
	
	public void clear(){
		while(deck.isEmpty() == false){
				deal();
			}
	
		}
		
	public int getSize(){
		return deck.size();
	}
	
	public Rank getRank(Card c){
		return c.getRank();	
	}
	
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
	
	public Suit getSuit(Card c){
		return c.getSuit();
	}
	
	private ArrayList<Card> deck;
	
}

