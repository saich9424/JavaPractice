package Observer;

import java.util.Observable;

public class Decorator extends DigitalClockView {
	
	protected final DigitalClockView dcv;
	
	public Decorator(DigitalClockView dcv)
	{
	this.dcv =dcv;
	}

	public void update(Observable obs, Object x) {
    	 dcv.update(obs, x);;
    };
	
}
