package simple;

import java.awt.event.MouseEvent;
import java.util.Random;

import colorfulsolitaire.model.Card;
import colorfulsolitaire.model.Deck;
import colorfulsolitaire.model.Rank;
import colorfulsolitaire.ui.CardImages;
import colorfulsolitaire.ui.DeckItem;
import colorfulsolitaire.ui.Item;

public class Stock extends DeckItem
{

   public Stock(CardImages images)
   {
      super(new Deck(), images);
      Deck deck = getDeck();
      deck.fill();
      deck.shuffle();
      this.images = images;
   }

   @Override
   public void handleClick(MouseEvent event)
   {
      // Play the actual game rules here
      Deck deck = getDeck();
      if (deck.isEmpty())
      {
         // Handle a win
         Game.setStatus("You win!");
         return;
      }
      else
      {
         Card top = deck.deal();
         top.flip();
         // Add top to table, in upper-right corner
         Item topItem = new FreeCard(top, images.getImage(top));
         topItem.setX(500);
         topItem.setY(50);
         Game.addToTable(topItem);
         
         Random random = new Random();
         int value = computeValue(top.getRank());
         for (int i = 1; i <= value; i++)
         {
            if (deck.isEmpty())
            {
               Game.setStatus("You lose!");
               return;
            }
            else
            {
               Card card = deck.deal();
               // Add card to table, in random position
               Item cardItem = new FreeCard(card, images.getImage(card));
               cardItem.setX(150 + random.nextInt(250));
               cardItem.setY(50 + random.nextInt(200));
               Game.addToTable(cardItem);
            }
         }

      }
   }

   @Override
   public boolean canDrop(Item item, MouseEvent event)
   {
      return false;
   }

   @Override
   public boolean canDrag(MouseEvent event)
   {
      return false;
   }

   private static int computeValue(Rank rank)
   {
      switch (rank)
      {
      case Ace:
         return 1;
      case Two:
         return 2;
      case Three:
         return 3;
      case Four:
         return 4;
      case Five:
         return 5;
      case Six:
         return 6;
      case Seven:
         return 7;
      case Eight:
         return 8;
      case Nine:
         return 9;
      case Ten:
         return 10;
      case Jack:
         return 10;
      case Queen:
         return 10;
      case King:
         return 10;
      default:
         return 0; // this should not happen
      }
   }
   
   private CardImages images;
}
