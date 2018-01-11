package Lab03;

import java.util.*;

public class Lab03Three {
	
	public static int[] getLetters( ArrayList<String> list ){
		int[] letters = new int[26];
		
		String nonLetters = "[^a-zA-Z0-9]";

		int k = 0;
		for (String str : list)
		    list.set(k++, str.replaceAll(nonLetters, ""));
		
		for(int i = 0; i < list.size(); i++){
			for(int j = 0; j < list.get(i).length(); j++){
				list.set(i, list.get(i).toLowerCase());
				if(list.get(i).charAt(j) - 97 >= 0 && list.get(i).charAt(j) - 97 <= 25)
					letters[list.get(i).charAt(j) - 97]++;				
			}
		}
		return letters;
	}
}
