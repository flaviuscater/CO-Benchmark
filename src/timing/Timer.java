
package timing;

/**
 * A Timer interface.
 */
public interface Timer {

	/**
	 * Start.
	 */
	void start();
	
	/**
	 * Stop.
	 *
	 * @return the long
	 */
	long stop();
	
	/**
	 * Pause.
	 *
	 * @return the long
	 */
	long pause();

	/**
	 * Resume.
	 */
	void resume();
}
