// A specific Observer to observe ClockTimerModel: DigitalClockView
//
package Observer;

import java.util.Observable;
import java.util.Observer;

class DigitalClockView implements Observer { 
    public 
    void update(Observable obs, Object x) {
    	//redraw my clock’s reading after I was notified

    	int second = ((ClockTimerModel) x).GetSecond(); 
    	System.out.print(second+" Seconds "); 
    };
};

