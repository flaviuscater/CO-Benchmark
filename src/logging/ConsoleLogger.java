
package logging;

/**
 * Prints representation of various data into the output console.
 */
public class ConsoleLogger implements Log {

	/**
	 * Writes a string into the console.
	 * @param value
	 * The String to be printed
	 */
	@Override
	public void write(String value) {
		System.out.println(value);
		
	}

	/**
	 * Writes a long into the console.
	 * @param value
	 * The long to be printed
	 */
	@Override
	public void write(long value) {
		System.out.println(value);
	}
	
	/**
	 * Writes multiple objects into the console.
	 * @param values
	 * The objects to be printed
	 */
	@Override
	public void write(Object... values) {
		for(Object object : values) {
			System.out.println(object);
		}
	}

	/**
	 * Writes a long into the console into a desired time unit.
	 * @param value
	 * The long to be printed
	 * @param timeUnit
	 * The time unit the long value will be converted
	 */
	@Override
	public void writeTime(long value, TimeUnit timeUnit) {
		switch (timeUnit) {
		case MS : System.out.println(value * Math.pow(10, -6) + "ms"); break;
		case US : System.out.println(value * Math.pow(10, -3) + "us"); break;
		case SEC : System.out.println(value * Math.pow(10, -9) + "sec"); break;
		default:
			break;
		}
		
	}

}
