package simple;

import java.awt.event.MouseEvent;

import colorfulsolitaire.model.Deck;
import colorfulsolitaire.ui.CardImages;
import colorfulsolitaire.ui.DeckItem;
import colorfulsolitaire.ui.Item;

public class Waste extends DeckItem
{

   public Waste(CardImages images)
   {
      super(new Deck(), images);
      // TODO Auto-generated constructor stub
   }

   @Override
   public boolean canDrop(Item item, MouseEvent event)
   {
      return item instanceof FreeCard;
   }

   @Override
   public boolean canDrag(MouseEvent event)
   {
      return false;
   }

}