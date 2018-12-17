package Observers;

import java.util.Observable;
import java.util.Observer;
public class MinutesDecorator extends ObserverDecorator{
	public MinutesDecorator(DigitalClockView clockview){
	super(clockview);
	}
	public void update(Observable obs,Object x){
		       	super.update(obs,x);

       	int minutes = ((ClockTimerModel) x).GetMinute();
       	System.out.print(minutes+ " minutes ");
        //super.update(obs,x);
    }
}