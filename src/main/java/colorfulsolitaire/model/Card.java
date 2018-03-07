package colorfulsolitaire.model;


//Aidan Cain
//Made this class to create a Card object with the properties of suit/rank/status. The toString method
//is used to take the properties and display them when the driver is run
public class Card {
   @Override
   public int hashCode()
   {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((rank == null) ? 0 : rank.hashCode());
      result = prime * result + ((suit == null) ? 0 : suit.hashCode());
      return result;
   }

   @Override
   public boolean equals(Object obj)
   {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      Card other = (Card) obj;
      if (rank != other.rank)
         return false;
      if (suit != other.suit)
         return false;
      return true;
   }
// give card a suit and rank and also is face down
   public Card(Rank rank, Suit suit) {
      this.rank = rank;
      this.suit = suit;
      this.faceUp = false;
   }
   // switches the card to face up
   public Card(Rank rank, Suit suit, boolean faceUp) {
      this.rank = rank;
      this.suit = suit;
      this.faceUp = faceUp;
   }
   // a string of the rank and suit
   public String toString() {
      return rank + " of " + suit;
   }
   // gets the rank
   public Rank getRank(){
      return rank;
   }
   // gets the suit 
   public Suit getSuit(){
      return suit;
   }
   // returns a face up card
   public boolean isFaceUp(){
      return faceUp;
   }
   // flips the card to face down 
   public void flip(){
      faceUp = !faceUp;
   }
   
   public String getAbbrev(){
      String retVal;
      String let1;
      String let2;
      
      switch(getRank()){
      case Ace: let1 = ("A");
      break;
      case Two: let1 = ("2");
      break;
      case Three: let1 = ("3");
      break;
      case Four: let1 = ("4");
      break;
      case Five: let1 = ("5");
      break;
      case Six: let1 = ("6");
      break;
      case Seven: let1 = ("7");
      break;
      case Eight: let1 = ("8");
      break;
      case Nine: let1 = ("9");
      break;
      case Ten: let1 = ("T");
      break;
      case Jack: let1 = ("J");
      break;
      case Queen: let1 = ("Q");
      break;
      case King: let1 = ("K");
      break;
      default: let1 = "0";
      }
      
      switch(suit){
      case Spades: let2 = "S";
      break;
      case Clubs: let2 = "C";
      break;
      case Diamonds: let2 = "D";
      break;
      case Hearts: let2 = "H";
      break;
      default: let2 = "0";
      }
      retVal = let1.concat(let2);
      return retVal;
   }
   
   

   private Rank rank;
   private Suit suit;
   private boolean faceUp;
}
