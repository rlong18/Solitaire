package window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;


import clock.ClockDriver;
import perpetualmotion.PMGameDriver;

public class MainFrame {
   public static JFrame frame;
   private static JComboBox cbox;
   private static int color = 0;
   /**
    * @param args
    */
    // creates a frame "main" 
   public static void main(String[] args) {
      frame = new JFrame("Main");
      frame.setSize(400, 200);
      frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      
      // create the buttons
      JButton button1 = new JButton("Perpetual Motion");
      button1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            JFrame frame1 = PMGameDriver.makeFrame();
            frame1.setVisible(true);
            frame.setVisible(false);
         }
      });
      JButton button2 = new JButton("Clock Solitaire");
      button2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            JFrame frame2 = ClockDriver.makeFrame();
            frame2.setVisible(true);
            frame.setVisible(false);
         }
         
         
      });
      
      // creates a drop down dombo box with the background colors the user can choose from
      String[] colors = {"Green", "Blue", "Red", "Orange", "Yellow"};
      cbox = new JComboBox(colors);
      
      cbox.addItemListener(
               new ItemListener(){
                  public void itemStateChanged(ItemEvent event){
                     if(event.getStateChange() == ItemEvent.SELECTED) 
                     switch(cbox.getSelectedIndex()){
                     case 0: color = 0; break;
                     case 1: color = 1; break;
                     case 2: color = 2; break;
                     case 3: color = 3; break;
                     case 4: color = 4; break;
                     }
                  }
               });
               
      
      JComponent box = Box.createHorizontalBox();
      box.add(button1);
      box.add(button2);
      box.add(cbox);
      
      frame.add(box);
      
      frame.setVisible(true);
   }
   
   public static int getColorValue() {
      return color;
   }

}
