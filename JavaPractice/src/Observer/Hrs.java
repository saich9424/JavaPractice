package Observer;

import java.util.Observable;

public class Hrs extends Decorator{

	public Hrs( DigitalClockView dcv) {
		super(dcv);
	}
	
	
	public void update(Observable obs, Object x) {
      super.update(obs, x) ;   
      int hour = ((ClockTimerModel) x).GetHour();
  	System.out.print(hour +" Hours"); 
  	System.out.println();

	
	}
	
	
	

}
