package csc232;

//Aidan Cain
//Made this class to create a Card object with the properties of suit/rank/status. The toString method
//is used to take the properties and display them when the driver is run
public class Card {
	public Card(Rank rank, Suit suit) {
		this.rank = rank;
		this.suit = suit;
	}
	
	public String toString() {
		return rank + " of " + suit;
	}
	
	public Rank getRank(){
		return rank;
	}
	
	public Suit getSuit(){
		return suit;
	}
	

	private Rank rank;
	private Suit suit;
}
