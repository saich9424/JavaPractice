package Observers;

import java.util.Observable;
import java.util.Observer;
public class SecondsDecorator extends ObserverDecorator{
	public SecondsDecorator(DigitalClockView clockview){
	super(clockview);
	}
	public void update(Observable obs,Object x){
       	   int seconds = ((ClockTimerModel) x).GetSecond();
       	   
       	   System.out.print(seconds+ " seconds ");
           super.update(obs,x);
    }
}