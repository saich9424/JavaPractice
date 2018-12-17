package Observers;

import java.util.Observable;
import java.util.Observer;
public class ObserverDecorator extends DigitalClockView{
       protected DigitalClockView clockview;
       public ObserverDecorator(DigitalClockView clockview){
       	this.clockview = clockview;
       }
       public void update(Observable obs,Object x){
       	clockview.update(obs,x);
       }
} 