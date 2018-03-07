package perpetualmotion;

import java.awt.event.MouseEvent;
//import java.util.Random;

import colorfulsolitaire.model.Card;
import colorfulsolitaire.model.Deck;
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
      
      if (deck.isEmpty()){
         
               if ((PMGameDriver.tableau1.isEmpty() == true) &&
                  (PMGameDriver.tableau2.isEmpty() == true) &&
                  (PMGameDriver.tableau3.isEmpty() == true) &&
                  (PMGameDriver.tableau4.isEmpty() == true))
               {
                  PMGameDriver.setStatus("You win!");
                  return;
               }

               if(PMGameDriver.tableau1.isEmpty() == false){
                  while(PMGameDriver.tableau1.isEmpty() == false){
                     Card cardBack = PMGameDriver.tableau1.removeCard();
                     cardBack.flip();
                     deck.add(cardBack);
                  }
               }
               if(PMGameDriver.tableau2.isEmpty() == false){
                  while(PMGameDriver.tableau2.isEmpty() == false){
                     Card cardBack = PMGameDriver.tableau2.removeCard();
                     cardBack.flip();
                     deck.add(cardBack);
                  }
               }
               if(PMGameDriver.tableau3.isEmpty() == false){
                  while(PMGameDriver.tableau3.isEmpty() == false){
                     Card cardBack = PMGameDriver.tableau3.removeCard();
                     cardBack.flip();
                     deck.add(cardBack);
                  }
               }
               if(PMGameDriver.tableau4.isEmpty() == false){
                  while(PMGameDriver.tableau4.isEmpty() == false){
                     Card cardBack = PMGameDriver.tableau4.removeCard();
                     cardBack.flip();
                     deck.add(cardBack);
                  }
               }
                        
               }
      
      else{
      
         Card top1 = deck.deal();
         top1.flip();
         PMGameDriver.tableau1.addCard(top1);
         
         Card top2 = deck.deal();
         top2.flip();
         PMGameDriver.tableau2.addCard(top2);
         
         Card top3 = deck.deal();
         top3.flip();
         PMGameDriver.tableau3.addCard(top3);
         
         Card top4 = deck.deal();
         top4.flip();
         PMGameDriver.tableau4.addCard(top4);
         
         if((top1.getRank() == top2.getRank()) &&
                  (top2.getRank() == top3.getRank()) && 
                  (top3.getRank() == top4.getRank())){
            PMGameDriver.tableau1.getDeck().deal();
            PMGameDriver.tableau2.getDeck().deal();
            PMGameDriver.tableau3.getDeck().deal();
            PMGameDriver.tableau4.getDeck().deal();
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

 /*  private static int computeValue(Rank rank)
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
   */
   private CardImages images;
   
}
