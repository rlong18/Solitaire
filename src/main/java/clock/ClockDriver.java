package clock;

import java.awt.BorderLayout;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

import colorfulsolitaire.model.Deck;
import colorfulsolitaire.ui.CardImages;
import colorfulsolitaire.ui.Item;
import colorfulsolitaire.ui.Table;
import window.MainFrame;

public class ClockDriver
{


   /**
    * @param args
    */
    //creates a frame and places tableau's in a clock format 
   public static void main(String[] args)
   {
      JFrame frame = makeFrame();
      
      frame.setVisible(true);
   }
   public static JFrame makeFrame() {
      final JFrame frame = new JFrame("Clock");
      frame.setSize(1200, 1200);
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
      // Creates each tableau and deck
      Stock stock = new Stock(images);
      stock.setX(50);
      stock.setY(50);
      table.addItem(stock);
      
      Deck tab1 = new Deck();
      Deck tab2 = new Deck();
      Deck tab3 = new Deck();
      Deck tab4 = new Deck();
      Deck tab5 = new Deck();
      Deck tab6 = new Deck();
      Deck tab7 = new Deck();
      Deck tab8 = new Deck();
      Deck tab9 = new Deck();
      Deck tab10 = new Deck();
      Deck tab11 = new Deck();
      Deck tab12 = new Deck();
      Deck tab13 = new Deck();
      
      tableau1 = new CTableau(tab1, 12, images);
      tableau1.setX(565);
      tableau1.setY(50);
      table.addItem(tableau1);
      
      tableau2 = new CTableau(tab2, 1, images);
      tableau2.setX(650);
      tableau2.setY(80);
      table.addItem(tableau2);
      
      tableau3 = new CTableau(tab3, 2, images);
      tableau3.setX(735);
      tableau3.setY(140);
      table.addItem(tableau3);
      
      tableau4 = new CTableau(tab4, 3, images);
      tableau4.setX(805);
      tableau4.setY(240);
      table.addItem(tableau4);
      
      tableau5 = new CTableau(tab5, 4, images);
      tableau5.setX(735);
      tableau5.setY(340);
      table.addItem(tableau5);
      
      tableau6 = new CTableau(tab6, 5, images);
      tableau6.setX(650);
      tableau6.setY(400);
      table.addItem(tableau6);
      
      tableau7 = new CTableau(tab7, 6, images);
      tableau7.setX(565);
      tableau7.setY(460);
      table.addItem(tableau7);
      
      tableau8 = new CTableau(tab8, 7, images);
      tableau8.setX(480);
      tableau8.setY(400);
      table.addItem(tableau8);
      
      tableau9 = new CTableau(tab9, 8, images);
      tableau9.setX(395);
      tableau9.setY(340);
      table.addItem(tableau9);
      
      tableau10 = new CTableau(tab10, 9, images);
      tableau10.setX(325);
      tableau10.setY(240);
      table.addItem(tableau10);
      
      tableau11 = new CTableau(tab11, 10, images);
      tableau11.setX(395);
      tableau11.setY(140);
      table.addItem(tableau11);
      
      tableau12 = new CTableau(tab12, 11, images);
      tableau12.setX(480);
      tableau12.setY(80);
      table.addItem(tableau12);
      
      tableau13 = new CTableau(tab13, 13, images);
      tableau13.setX(565);
      tableau13.setY(240);
      table.addItem(tableau13);
     

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
   
   public static CTableau tableau1;

   public static CTableau tableau2;

   public static CTableau tableau3;

   public static CTableau tableau4;
   
   public static CTableau tableau5;
   
   public static CTableau tableau6;
   
   public static CTableau tableau7;
   
   public static CTableau tableau8;
   
   public static CTableau tableau9;
   
   public static CTableau tableau10;
   
   public static CTableau tableau11;
   
   public static CTableau tableau12;
   
   public static CTableau tableau13;
   
   // set the status of the card to a string
   public static void setStatus(String string)
   {
      status.setText(string);
   }

// adds an item to the table
   public static void addToTable(Item item)
   {
      table.addItem(item);
   }
   // Removes an item from the table
   public static void removeFromTable(Item item)
   {
      table.removeItem(item);
   }
   // 
   
   
}
