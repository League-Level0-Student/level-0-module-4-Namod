package _07_sleepy_head;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        int  isWeekday, isVacation;
        
        /* You MUST use the above boolean variables in your code */
        
        
         // Ask the user for these values using a confirm dialog like the one below
   isWeekday =JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
         
    JOptionPane.showMessageDialog(null, isWeekday);

    isVacation=JOptionPane.showConfirmDialog(null, "Is it a Vacation?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
    JOptionPane.showMessageDialog(null, isVacation);
 
    if(isWeekday == 0){
    	if (isVacation == 0) {
    		JOptionPane.showConfirmDialog(null, "sleep in");
    	}
    	else {
    	JOptionPane.showMessageDialog(null, " Get up lazybones");
    }}
    
    else {
    	JOptionPane.showConfirmDialog(null, "Sleep in");
    }
    
    
    
         /* Print “sleep in�? if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!�? If it is a weekday, and we are on vacation,
         * print “sleep in�?.
         */
    }
}
