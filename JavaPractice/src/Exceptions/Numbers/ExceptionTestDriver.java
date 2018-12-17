package soen6441.exception.samples;

/**
 * 
 * A class showing how to handle exceptions in Java.
 * 
 * @author Sleiman Rabah - Concordia University Fall 2012.
 */
public class ExceptionTestDriver {

	/**
	 * Default constructor.
	 */
	public ExceptionTestDriver() {
	}

	/**
	 * A method that calculates the unit price of something based on items' total cost and quantity.
	 * 
	 * @param totalCost the total cost.
	 * @param quantity the items quantity.
	 * @return the calculated price per unit.
	 * @throws DivideByZero
	 *             a divide by zero exception.
	 */
	public double calculateUnitPrice(double totalCost, int quantity)
			throws DivideByZero {

		double unitPrice = 0.0f;

		try {
			System.out.println("\nExecuting \"calculateUnitPrice\" method...");
			
			// Calculate unit price of something here.
			if (totalCost < 0) {
				throw new NegativeNumber("The total cost must not be negative!");
			}
			if (quantity == 0) {
				throw new DivideByZero(); // Throws a DivideByZero exception
			}
			unitPrice = totalCost / quantity;
		} catch (NegativeNumber e) {
			System.err.println("An error occured while trying to calculate the unit price.");
		}
		finally {
			if (unitPrice == 0) {
				System.err.println("Something went wrong and could not calculate the unit price.");
			} else {
				System.out.println("Unit price calculated successfully!.");
			}
		}

		return unitPrice;
	}

	/**
	 * A method that calculates the unit price of something based on items' total cost and quantity.
	 * It simulates catching multiple exception types.
	 * 
	 * Pay attention to the order of the use of catch blocks!
	 * 
	 * @param totalCost the total cost.
	 * @param quantity the items quantity.
	 * @return the calculated price per unit.
	 */
	public double calculateUnitPriceWithoutThrows(double totalCost, int quantity) {

		double unitPrice = 0.0f;

		try {
			System.out.println("\nExecuting \"calculateUnitPriceWithoutThrows\" method...");
			// Calculate unit price of something here.
			if (totalCost < 0) {
				throw new NegativeNumber("The total cost must not be negative!");
			}
			if (quantity == 0) {
				throw new DivideByZero("Division by zero is not allowed");
			}
			unitPrice = totalCost / quantity;

		} catch (NegativeNumber e) {
			System.err.println("An error occured while trying to calculate the unit price.");
			System.err.println("Message: " + e.getMessage());

		} catch (DivideByZero e) {
			System.err.println("An error occured while trying to calculate the unit price.");
			System.err.println("Message: " + e.getMessage());
		} 
		catch (Exception e) {
			System.err.println("Generic exception goes here: " + e.getMessage());	
		}
		finally {
			if (unitPrice == 0) {
				System.err.println("Something went wrong and could not calculate the unit price.");
			} else {
				System.out.println("Unit price calculated successfully!.");
			}
		}

		return unitPrice;
	}

	public static void main(String[] args) {

		double unitPrice = 0.0;
		double totalCost = 25.99;
		int quantity = 0;

		ExceptionTestDriver testDriver = new ExceptionTestDriver();
		//--
		unitPrice = testDriver.calculateUnitPriceWithoutThrows(totalCost,quantity);
		System.out.println("The unit price is :" + unitPrice);
		//-- 
		try {
			//-- Call the "calculateUnitPrice" that throws an "DivideByZero" exception.
			unitPrice = testDriver.calculateUnitPrice(totalCost,quantity);
			System.out.println("The unit price is :" + unitPrice);
		} catch (DivideByZero e) {
			System.err.println("Error: " + e.getMessage());
		}
	}
}
