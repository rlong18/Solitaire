package perpetualmotion;

import java.awt.event.MouseEvent;

import colorfulsolitaire.model.Card;
import colorfulsolitaire.model.Deck;
import colorfulsolitaire.ui.CardImages;
import colorfulsolitaire.ui.CardItem;
import colorfulsolitaire.ui.DeckItem;
import colorfulsolitaire.ui.Item;

public class Tableau extends DeckItem
{


   public Tableau(Deck deck, CardImages images)
   {
      super(deck, images);
      // TODO Auto-generated constructor stub
   }
   
   @Override
   public boolean canDrop(Item item, MouseEvent event)
   {
      Card c = ((CardItem) item).getCard();
      
      if (this.getDeck().isEmpty() == true){
         return false;
      }
      
      else if(c.getRank() == this.getDeck().getTop().getRank()){
         return true;
      }
      
      else return false;

   }

   @Override
   public boolean canDrag(MouseEvent event)
   {
      return true;
   }

   public void add(Item item, Card card)
   {
      super.addCard(card);
   }

}