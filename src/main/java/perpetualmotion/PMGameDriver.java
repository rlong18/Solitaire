package perpetualmotion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ItemEvent;
import window.MainFrame;
import javax.swing.JFrame;
import javax.swing.JLabel;


import colorfulsolitaire.model.Deck;
import colorfulsolitaire.ui.CardImages;
import colorfulsolitaire.ui.Item;
import colorfulsolitaire.ui.Table;

public class PMGameDriver
{


   /**
    * @param args
    */
   public static void main(String[] args)
   {
      JFrame frame = makeFrame();
      
      frame.setVisible(true);
   }
      public static JFrame makeFrame(){
      final JFrame frame = new JFrame("Perpetual Motion");
      frame.setSize(600, 400);
      frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      frame.setLayout(new BorderLayout());
      table = new Table();
      int cNum = MainFrame.getColorValue();
      switch(cNum){
      case 0: table.setBackground(DARK_GREEN); break;
      case 1: table.setBackground(BLUE); break;
      case 2: table.setBackground(RED); break;
      case 3: table.setBackground(ORANGE); break;
      case 4: table.setBackground(YELLOW); break;
      default: table.setBackground(DARK_GREEN); break;
      }
      frame.add(table, BorderLayout.CENTER);
      
      status = new JLabel("Click stock pile");
      frame.add(status, BorderLayout.SOUTH);

      CardImages images = new CardImages("/cards/", ".png");

      // Do interesting stuff here
      Stock stock = new Stock(images);
      stock.setX(50);
      stock.setY(50);
      table.addItem(stock);
      
      Deck tab1 = new Deck();
      Deck tab2 = new Deck();
      Deck tab3 = new Deck();
      Deck tab4 = new Deck();
      
      tableau1 = new Tableau(tab1, images);
      tableau1.setX(225);
      tableau1.setY(50);
      table.addItem(tableau1);
      
      tableau2 = new Tableau(tab2, images);
      tableau2.setX(300);
      tableau2.setY(50);
      table.addItem(tableau2);
      
      tableau3 = new Tableau(tab3, images);
      tableau3.setX(375);
      tableau3.setY(50);
      table.addItem(tableau3);
      
      tableau4 = new Tableau(tab4, images);
      tableau4.setX(450);
      tableau4.setY(50);
      table.addItem(tableau4);

      frame.setVisible(true);
      return frame;
   }

   private static final Color DARK_GREEN = new Color(0, 128, 0);
   private static final Color BLUE = new Color(51, 255, 255);
   private static final Color RED = new Color(255, 51, 51);
   private static final Color ORANGE = new Color(255, 153, 51);
   private static final Color YELLOW = new Color(255, 255, 102);

   private static JLabel status;

   private static Table table;
   
   public static Tableau tableau1;

   public static Tableau tableau2;

   public static Tableau tableau3;

   public static Tableau tableau4;
   
   public static void setStatus(String string)
   {
      status.setText(string);
   }

   public static void addToTable(Item item)
   {
      table.addItem(item);
   }
   
   public static void removeFromTable(Item item)
   {
      table.removeItem(item);
   }
   
  
}
