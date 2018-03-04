
package timing;

/**
 * Implementations of time measurement methods.
 */
public class MyTimer implements Timer {

	/** The start time. */
	private long startTime;
	
	/** The run time. */
	private long runTime;
	
	/**
	 * Starts the timer.  
	 */
	@Override
	public void start() {
		startTime = System.currentTimeMillis();
		runTime = 0;
	}

	/**
	 * Stops the timer.  
	 */
	@Override
	public long stop() {
		long endTime = System.currentTimeMillis() - startTime + runTime;
		runTime = 0;
		return endTime;
	}

	/**
	 * Pause the timer.  
	 */
	@Override
	public long pause() {
		long currentTime = System.currentTimeMillis() - startTime;
		runTime = runTime + currentTime;
		return runTime;
	}

	/**
	 * Resume the timer.  
	 */
	@Override
	public void resume() {
		startTime = System.currentTimeMillis();
	}


}
