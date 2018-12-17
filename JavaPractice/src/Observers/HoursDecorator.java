package Observers;

import java.util.Observable;
import java.util.Observer;
public class HoursDecorator extends ObserverDecorator{
	public HoursDecorator(DigitalClockView clockview){
	super(clockview);
	}
	public void update(Observable obs,Object x){
       	int hours = ((ClockTimerModel) x).GetHour();
       	super.update(obs,x);
       	System.out.println(hours+ " hours ");
        //super.update(obs,x);
    }
}