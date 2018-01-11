package Quizzes;

import java.util.ArrayList;

public class Quiz2 {
	public static ArrayList<Integer> getOdds(ArrayList<Integer> list){
		ArrayList<Integer> newList = new ArrayList<Integer>();
		for(int i = 0; i < list.size(); i++){
			if(list.get(i) % 2 != 0)
				newList.add(list.get(i));
		}
		return newList;
	}
}
