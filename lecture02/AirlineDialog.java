package lecture02;

import javax.swing.JOptionPane;
public class AirlineDialog{
    
   public static void main(String[] args){
      int selection;
      boolean isConfirmed;
      selection = JOptionPane.showConfirmDialog(null,
         "Do you want to upgrade to first class?"); 
      isConfirmed = (selection == JOptionPane.YES_OPTION);
      JOptionPane.showMessageDialog(null,
         "You responded " + isConfirmed);
   }
}
