package perpetualmotion;

import java.awt.Image;
import java.awt.event.MouseEvent;

import colorfulsolitaire.model.*;
import colorfulsolitaire.ui.*;


// gets a free card and  allows it to be dragged 
public class FreeCard extends AbstractItem
{
   public FreeCard(Card card, Image image)
   {
      this.card = card;
      this.image = image;
   }

   public Card getCard()
   {
      return card;
   }

   public Image getImage()
   {
      return image;
   }

   public void handleClick(MouseEvent event)
   {
      // do nothing
   }

   public boolean canDrop(Item item, MouseEvent event)
   {
      // do not accept drops
      return false;
   }

   public void handleDrop(Item item, MouseEvent event)
   {
      // not used
   }

   public boolean canDrag(MouseEvent event)
   {
      return true;
   }

   public Item startDrag(MouseEvent event)
   {
      return this;
   }

   public void endDrag(Item item, MouseEvent event)
   {
      PMGameDriver.removeFromTable(this);
      // this card has been dropped on a target deck; add it there
      DeckItem target = (DeckItem) item;
      target.addCard(card);
   }

   public void cancelDrag(MouseEvent event)
   {
      // leave the card where it falls
   }

   private Card card;
   private Image image;
}
