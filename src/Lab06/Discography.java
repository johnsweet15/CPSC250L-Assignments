package Lab06;

import java.io.*;
import java.util.*;

public class Discography {
	
	public static void writeReport(File input, File output){
		try{
			Scanner scanner = new Scanner(input);
			PrintWriter writer = new PrintWriter(output);
			scanner.useDelimiter(",");
			
			while(scanner.hasNext()){
				String str = scanner.next();
				
			}
			
			scanner.close();
			writer.close();
		}
		catch(IOException e){
			
		}
	}
}
