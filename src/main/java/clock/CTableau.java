package clock;

import java.awt.event.MouseEvent;

import colorfulsolitaire.model.Card;
import colorfulsolitaire.model.Deck;
import colorfulsolitaire.ui.CardImages;
import colorfulsolitaire.ui.CardItem;
import colorfulsolitaire.ui.DeckItem;
import colorfulsolitaire.ui.Item;

public class CTableau extends DeckItem
{

   

   private int spaceVal;

   public CTableau(Deck deck, int spaceVal, CardImages images)
   {
      super(deck, images);
      this.spaceVal = spaceVal;
      
   }
   
   @Override
   public boolean canDrop(Item item, MouseEvent event)
   {
      Card c = ((CardItem) item).getCard();
      int rankVal = 0;
      
      switch(c.getRank()){
      case Ace: rankVal = 1; break;
      case Two: rankVal = 2; break;
      case Three: rankVal = 3; break;
      case Four: rankVal = 4; break;
      case Five: rankVal = 5; break;
      case Six: rankVal = 6; break;
      case Seven: rankVal = 7; break;
      case Eight: rankVal = 8; break;
      case Nine: rankVal = 9; break;
      case Ten: rankVal = 10; break;
      case Jack: rankVal = 11; break;
      case Queen: rankVal = 12; break;
      case King: rankVal = 13; break;
      }
      // displays the rank of each card and where that card can be dropped

      if (this.getDeck().isEmpty() == true){
         return false;
      }
      // if the deck is empty return false
      
      else if(rankVal == this.spaceVal){
         return true;
      }
      // if the rank value of the card equals the value of the space it is dragged to than it returns true.
      
      else return false;

   }

   @Override
   public boolean canDrag(MouseEvent event)
   {
      if(this.getDeck().isEmpty() == true){
         return false;
      }
      
      else if(this.getDeck().getTop().getRank().toString() == "King" && ClockDriver.tableau13.isEmpty()){
         ClockDriver.setStatus("YOU LOSE");
         return true;
      }
      
      if(this.getDeck().getTop().isFaceUp() == true){
      return true;
      }
      
      else return false;
   }

   public void add(Item item, Card card)
   {
      super.addCard(card);
   }
   // adds a card to the deck item
   @Override
   public void handleDrop(Item item, MouseEvent event)
   {
      // TODO Auto-generated method stub
      super.handleDrop(item, event);
      this.getDeck().deal();
      this.getDeck().getTop().flip();
      //handle loss
      Card c = ((CardItem) item).getCard();
      int count = 0;
      if(ClockDriver.tableau1.isEmpty() || ClockDriver.tableau2.isEmpty() || 
               ClockDriver.tableau3.isEmpty() || ClockDriver.tableau4.isEmpty() || 
               ClockDriver.tableau5.isEmpty() || ClockDriver.tableau6.isEmpty() || 
               ClockDriver.tableau7.isEmpty() || ClockDriver.tableau8.isEmpty() || 
               ClockDriver.tableau9.isEmpty() || ClockDriver.tableau10.isEmpty() || 
               ClockDriver.tableau11.isEmpty() || ClockDriver.tableau12.isEmpty() || 
               ClockDriver.tableau13.isEmpty()){
            if(ClockDriver.tableau1.isEmpty()){
               count++;
            }
            else if(ClockDriver.tableau2.isEmpty()){
               count++;
            }
            else if(ClockDriver.tableau3.isEmpty()){
               count++;
            }
            else if(ClockDriver.tableau4.isEmpty()){
               count++;
            }
            else if(ClockDriver.tableau5.isEmpty()){
               count++;
            }
            else if(ClockDriver.tableau6.isEmpty()){
               count++;
            }
            else if(ClockDriver.tableau7.isEmpty()){
               count++;
            }
            else if(ClockDriver.tableau8.isEmpty()){
               count++;
            }
            else if(ClockDriver.tableau9.isEmpty()){
               count++;
            }
            else if(ClockDriver.tableau10.isEmpty()){
               count++;
            }
            else if(ClockDriver.tableau11.isEmpty()){
               count++;
            }
            else if(ClockDriver.tableau12.isEmpty()){
               count++;
            }
            else if(ClockDriver.tableau13.isEmpty()){
               count++;
            }
            if((count == 12) && c.getRank().toString() == "King"){
               ClockDriver.setStatus("You Win!!!");
            }
            // places the cards into the tableau's and than says if the king is at the right spot then you win the game.
      }
      
   }

}
