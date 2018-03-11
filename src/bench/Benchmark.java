/*
 * 
 */
package bench;

import java.math.BigDecimal;

// TODO: Auto-generated Javadoc
/**
 * Benchmark different hardware components.
 */
public interface Benchmark {
	
	/**
	 * Initiliaze.
	 *
	 * @param param the param
	 */
	void initiliaze(Object param);
	
	/**
	 * Run.
	 */
	BigDecimal run();	

	/**
	 * Clean.
	 */
	void clean();
}
