package Quizzes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Quiz6 {

	public static ArrayList<String> getAnyOther(File file){
		
		ArrayList<String> list = new ArrayList<String>();
		
		try {
			Scanner scanner = new Scanner(file);
			
			while(scanner.hasNext()){
				list.add(scanner.next());
				if(scanner.hasNext())
					scanner.next();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
