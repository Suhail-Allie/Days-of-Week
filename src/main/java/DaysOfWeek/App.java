/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package DaysOfWeek;
import javax.swing.*;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        String[] Day = new String[7];
        String Days;
       
        for (int i= 0; i < Day.length; i++) 
        {
          Days = JOptionPane.showInputDialog("Please enter days of the week :");
          Day[i] = Days;   
        }
        JOptionPane.showMessageDialog(null, Day);
        
    }
}
            
            
            