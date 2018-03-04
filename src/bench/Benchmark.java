/*
 * 
 */
package bench;

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
	void run();	

	/**
	 * Clean.
	 */
	void clean();
}
