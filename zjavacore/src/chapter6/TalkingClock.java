package chapter6;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.Timer;

public class TalkingClock {
	private int interval; 
	private boolean beep; 
	public TalkingClock(int interval, boolean beep)	{
		this.interval = interval; 
		this.beep = beep;
	}
	public void start() { 
		 ActionListener listener = new TimePrinter();
		 Timer t = new Timer(interval, listener); 
		 t.start();
	}
	public class TimePrinter implements ActionListener {
		@Override 
		public void actionPerformed(ActionEvent event) {
			  System.out.println("At the tone, the time is " + new Date() ); 
			  if(beep) Toolkit.getDefaultToolkit().beep();
		 }

		
		
	}
	
	
	
	
	
	
	
	
	
	
}
