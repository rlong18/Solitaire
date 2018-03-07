package colorfulsolitaire.model;

/**
 * Plays a simple card game, as described in Homework #4.
 * 
 * 
 */
public class GameDriver
{
   // creates a deck, fills it with card, then shuffles it
   public static void main(String[] args)
   {
      Deck deck = new Deck();
      deck.fill();
      deck.shuffle();
// plays the game and indicates if the player won or lost
      while (!deck.isEmpty())
      {
         Card card = deck.deal();
         System.out.println(card);

         int value = computeValue(card.getRank());
         for (int i = 1; i <= value; i++)
         {
            if (deck.isEmpty())
            {
               System.out.println("You Lost!");
               return;
            }
            else
            {
               deck.deal();
               System.out.println("Dealing card " + i);
            }
         }
      }

      System.out.println("You Won!");
   }

   /**
    * Compute the "value" of the given rank: ace is 1, two is 2, ..., ten is 10,
    * and all face cards are also 10.
    * 
    * @param rank
    * @return The value of the given rank
    */
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
}


