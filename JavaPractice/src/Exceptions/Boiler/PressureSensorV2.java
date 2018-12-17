package Exceptions.Boiler;

import java.util.Random;

public class PressureSensorV2 {

	
	public PressureSensorV2() {
		randomGenerator = new Random();
	}

	int getPressure2() throws NegativePressureException,
			OverloadPressureException {
		System.out.println("in PressureSensor2s::getPressure()");
		int pressure = randomGenerator.nextInt(105) - 90;
		if (pressure < 0) {
			System.out.println("about to throw NegativePressureException");
			throw new NegativePressureException(pressure);
		}
		if (pressure > 10) {
			System.out.println("about to throw OverloadPressureException");
			throw new OverloadPressureException(pressure);
		}
		return pressure;
	}

	private Random randomGenerator;
}
