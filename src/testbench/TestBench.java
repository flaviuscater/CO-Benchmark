
package testbench;

import java.io.File;
import java.math.BigDecimal;

import bench.cpu.CPUDigitsofPi;
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
		//log = new FileLogger(new File("./Logs/test.txt"));
		
		CPUDigitsofPi cpuDigitsofPi = new CPUDigitsofPi(16000);
		timer.start();
		BigDecimal bigDecimal = cpuDigitsofPi.run();
		long durrationTime = timer.stop();
		log.writeTime(durrationTime, TimeUnit.MS);
		//log = new FileLogger(new File("./Logs/test.txt"));
		//log.write(bigDecimal);
		
			
	}

}
