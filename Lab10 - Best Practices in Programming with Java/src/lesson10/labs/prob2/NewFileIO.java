package lesson10.labs.prob2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class NewFileIO {
	private static final Logger LOG = Logger.getLogger(OldFileIO.class.getName());
	public final static String FILE_LOCATION = "src/lesson10/labs/prob3/bug_report.txt";
	public final static String TO_PRINT = "This is the string to print to file.";
	
	public void writeText(String filename, String text) {
		
		File f = new File(filename);
		try (PrintWriter writer=new PrintWriter(new FileWriter(f))){
			
			writer.print(text);
			
		} catch(IOException e) {
			LOG.warning("IOException attempting to write a file: " + e.getMessage());
			List<Throwable> superessed=Arrays.asList(e.getSuppressed());
			superessed.forEach(except->LOG.warning(except.getMessage()));
			
		}
		
	}
	
	public static void main(String[] args) {
		NewFileIO neww = new NewFileIO();
		neww.writeText(FILE_LOCATION, TO_PRINT);
		
	}

}
