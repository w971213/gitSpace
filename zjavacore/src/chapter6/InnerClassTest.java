package chapter6;

import javax.swing.JOptionPane;

/**
 *@author fish fly
 *@version 1.8
 *@date 2019年7月2日
 * This program demonstrates the use of inner classes, 
 */
public class InnerClassTest {
	public static void main(String[] args) {
		TalkingClock clock = new TalkingClock(1000, true);
		clock.start();
		
		// keep program running until user selects "0k" 
		JOptionPane.showMessageDialog(null, "Quit program?"); 
		System.exit(0); 
	}
	
	
	
	
	
	
	
	
}
