/**
 * 
 */
package app;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import app.IRDecoder;

/**
 * @author Chetan Mahajan
 *
 */
public class Simulator {

	public Simulator(String fileName) {

		String line = null;

		try {
			// FileReader reads text files in the default encoding.
			FileReader fileReader = new FileReader(fileName);

			// Always wrap FileReader in BufferedReader.
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			IRDecoder irDecoder=IRDecoder.getInstance();

			while ((line = bufferedReader.readLine()) != null) {
				irDecoder.readLine(line);
			}

			// Always close files.
			bufferedReader.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + fileName + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + fileName + "'");
			// Or we could just do this:
			// ex.printStackTrace();
		}
		

	}

	public void run() {

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length == 1) {
			String fileName = args[0];
			Simulator simulator = new Simulator(fileName);
			simulator.run();

		} else {
			System.err.println(" Invalid command-line option ");
			System.err.println("usage: java filename");
			return;
		}

	}

}
