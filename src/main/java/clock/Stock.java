package clock;

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
       //do nothing
    }
    
    else{
    
       for(int i = 0; i < 4; i++){
          
       Card top1 = deck.deal();
       ClockDriver.tableau1.addCard(top1);
       
       Card top2 = deck.deal();
       ClockDriver.tableau2.addCard(top2);
       
       Card top3 = deck.deal();
       ClockDriver.tableau3.addCard(top3);
       
       Card top4 = deck.deal();
       ClockDriver.tableau4.addCard(top4);
       
       Card top5 = deck.deal();
       ClockDriver.tableau5.addCard(top5);
       
       Card top6 = deck.deal();
       ClockDriver.tableau6.addCard(top6);
       
       Card top7 = deck.deal();
       ClockDriver.tableau7.addCard(top7);
       
       Card top8 = deck.deal();
       ClockDriver.tableau8.addCard(top8);
       
       Card top9 = deck.deal();
       ClockDriver.tableau9.addCard(top9);
       
       Card top10 = deck.deal();
       ClockDriver.tableau10.addCard(top10);
       
       Card top11 = deck.deal();
       ClockDriver.tableau11.addCard(top11);
       
       Card top12 = deck.deal();
       ClockDriver.tableau12.addCard(top12);
       
       if(i < 3){
          Card top13 = deck.deal();
          ClockDriver.tableau13.addCard(top13);
       }
       else{
       Card top13 = deck.deal();
       top13.flip();
       ClockDriver.tableau13.addCard(top13);
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

 @SuppressWarnings("unused")
private CardImages images;
}