package simple;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

import colorfulsolitaire.ui.CardImages;
import colorfulsolitaire.ui.Item;
import colorfulsolitaire.ui.Table;

public class Game
{

   /**
    * @param args
    */
    // makes the frame, tableau's and stocks for the game 
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Demo");
      frame.setSize(600, 400);
      frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      frame.setLayout(new BorderLayout());

      table = new Table();
      table.setBackground(DARK_GREEN);
      frame.add(table, BorderLayout.CENTER);
      
      status = new JLabel("Click stock pile");
      frame.add(status, BorderLayout.SOUTH);

      CardImages images = new CardImages("/cards/", ".png");

      // Do interesting stuff here
      Stock stock = new Stock(images);
      stock.setX(50);
      stock.setY(50);
      table.addItem(stock);
      
      Waste waste = new Waste(images);
      waste.setX(50);
      waste.setY(200);
      table.addItem(waste);

      frame.setVisible(true);
   }

   private static final Color DARK_GREEN = new Color(0, 128, 0);

   private static JLabel status;

   private static Table table;
   
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
