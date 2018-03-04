
package testbench;

import java.io.File;

import logging.ConsoleLogger;
import logging.FileLogger;
import logging.Log;
import logging.Log.TimeUnit;
import timing.MyTimer;
import timing.Timer;

/**
 * The Class TestBench.
 */
public class TestBench {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		
		Timer timer = new MyTimer();
		Log log = new ConsoleLogger();
		
		timer.start();
		for(int i=0; i<9000; i++) {
			String tmp = " some " + "tmp" + i;
			int tmpInt = 0;
			tmpInt+= i;
		}
		
		long durrationTime = timer.pause();
		log.writeTime(durrationTime, TimeUnit.MS);
		
		log = new FileLogger(new File("./Logs/test.txt"));
		log.writeTime(durrationTime, TimeUnit.MS);
			
	}

}
