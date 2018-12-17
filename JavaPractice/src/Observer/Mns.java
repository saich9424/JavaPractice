package Observer;

import java.util.Observable;

public class Mns extends Decorator{

	public Mns( DigitalClockView dcv) {
		super(dcv);
	}
	
	
	public void update(Observable obs, Object x) {
      super.update(obs, x) ;   
      int minute = ((ClockTimerModel) x).GetMinute();
  	System.out.print(minute +" Minutes "); 
  	
  	

	
	}
	
	
	

}
