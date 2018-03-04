
package logging;

/**
 * Interface used for all the logging Classes.
 */
public interface Log {

	
	/**
	 * Some usual time units.
	 */
	public enum TimeUnit{
		
		/** Nanoseconds. */
		NS, 
		
		/** Milliseconds. */
		MS, 
		
		/** Microseconds. */
		US, 
		
		/** Seconds. */
		SEC;
	}
	
	
	/**
	 * Write a string.
	 *
	 * @param value
	 * The String to be printed
	 */
	void write(String value);

	/**
	 * Writes a long.
	 *
	 * @param value
	 * The long to be printed
	 */
	void write(long value);	

	/**
	 * Writes the objects.
	 *
	 * @param values
	 * The objects to be printed
	 */
	void write(Object ...values);

	/**
	 * Writes a value in desired time unit.
	 *
	 * @param value
	 * The long to be printed
	 * @param timeUnit
	 * Time unit to be set to
	 */
	void writeTime(long value, TimeUnit timeUnit);

	
}
