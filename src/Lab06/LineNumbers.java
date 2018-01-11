package Lab06;

import java.io.*;
import java.util.*;

public class LineNumbers {
	
	public static void process(File input, File output){
		try{
			Scanner scanner = new Scanner(input);
			PrintWriter writer = new PrintWriter(output);
			int number = 1;
			
			while(scanner.hasNext()){
				String str = scanner.nextLine();
				writer.printf("%3d" + " | " + str + "\n", number);
				number++;
			}
			
			scanner.close();
			writer.close();
		}
		catch(IOException e){
			
		}	
	}
}
