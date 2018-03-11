
package logging;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;


/**
 * Prints representation of various data into a output file.
 */
public class FileLogger implements Log {
	
	/** The output file. */
	private File outputFile;
	

	/**
	 * Instantiates a new file logger.
	 *
	 * @param file
	 * Set the output file
	 */
	public FileLogger(File file) {
		this.outputFile = file;
	}

	/**
	 * Writes a string into the file.
	 * @param value
	 * The String to be written
	 */
	@Override
	public void write(String value) {
		PrintWriter printWriter = null;
	try {
		 printWriter = new PrintWriter(new FileOutputStream(this.outputFile), true);
		printWriter.print(value);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	finally {
		printWriter.close();
	}
	}

	
	/**
	 * Writes a long into the file.
	 * @param value
	 * The long to be written
	 */
	@Override
	public void write(long value) {
		this.write();
	}
	
	/**
	 * Writes objects into the file.
	 * @param values
	 * The objects to be written
	 */
	@Override
	public void write(Object... values) {
		
		PrintWriter printWriter = null;
		try {
			 printWriter = new PrintWriter(this.outputFile);
			 for(Object object : values)
			printWriter.print(object);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			printWriter.close();
		}
	}

	/**
	 * Writes a long into the file into a desired time unit.
	 * @param value
	 * The long to be printed
	 * @param timeUnit
	 * The time unit the long value will be converted
	 */
	@Override
	public void writeTime(long value, TimeUnit timeUnit) {
		
		PrintWriter printWriter = null;
		try {
			 printWriter = new PrintWriter(this.outputFile);
			 switch (timeUnit) {
				case MS : printWriter.print(value + "ms"); break;
				case US : printWriter.print(value * Math.pow(10, 3) + "us"); break;
				case SEC : printWriter.print(value * Math.pow(10, -3) + "sec"); break;
				default:
					break;
				}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			printWriter.close();
		}
		
	}

	/**
	 * Gets the output file.
	 *
	 * @return the output file
	 */
	public File getOutputFile() {
		return outputFile;
	}

}
