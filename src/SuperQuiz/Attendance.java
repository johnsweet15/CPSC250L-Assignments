package SuperQuiz;

import java.io.*;
import java.util.*;

public class Attendance {

	public static void foo(File input, File output){
		ArrayList<String> names = new ArrayList<String>();
		try{
			Scanner scanner = new Scanner(input);
			PrintWriter writer = new PrintWriter(output);
			
			int max = 0;
			
			while(scanner.hasNextLine()){
				String str = scanner.nextLine();
				int num = Integer.parseInt(str.substring(str.length() - 1, str.length()));
				str = str.substring(0, str.length() - 2);
				if(num > max){
					max = num;
					names.clear();
					names.add(str);
				}
				else if(num == max)
					names.add(str);
			}
			
			if(names.size() > 1)
				Collections.sort(names);
			
			for(String n : names){
				writer.println(n);
			}
			
			scanner.close();
			writer.close();
		}catch(IOException e){
			
		}
	}
	
}
