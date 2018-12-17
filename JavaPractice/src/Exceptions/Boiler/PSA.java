package Exceptions.Boiler;

public class PSA extends PressureSensor {
	
	PressureSensorV2 psv2;
	
	
	PSA(	PressureSensorV2 psv2)
	{
		
		this.psv2=psv2;
	}
	
	
	int getPressure()
	{
		int pressure = 999;

		try {
			pressure= psv2.getPressure2();
		} catch (NegativePressureException | OverloadPressureException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return pressure;
	}
	}
	

