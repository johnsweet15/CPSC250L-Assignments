package Lab03;

import java.util.*;

public class Lab03Two {
	
	public static int getTally(ArrayList<Integer> list, int number){
		int count = 0;
		for(int i = 0; i < list.size(); i++){
			if(list.get(i) == number)
				count++;
		}
		return count;
	}
	
	public static int getFirstIndex(ArrayList<Integer> list, int number){
		int index = -1;
		for(int i = 0; i < list.size(); i++){
			if(list.get(i) == number){
				index = i;
				break;
			}
		}
		return index;
	}
	
	public static void doReverse(ArrayList<Integer> list){
		Collections.reverse(list);
	}

	public static ArrayList<Integer> getSorted(ArrayList<Integer> one, ArrayList<Integer> two, boolean ascendingly){
		ArrayList <Integer> list = new ArrayList <Integer>();
		list.addAll(one);
		list.addAll(two);
		if(ascendingly == true){
			Collections.sort(list);
		}
		if(ascendingly == false){
			Collections.sort(list);
			Collections.reverse(list);
		}
		
		return list;
	}
	
	public static ArrayList<Integer> getUnion( ArrayList<Integer> one, ArrayList<Integer> two ){
		ArrayList <Integer> list = new ArrayList <Integer>();
		one.removeAll(two);
		
		list.addAll(one);
		list.addAll(two);
		
		if(list.get(0) == list.get(1))
			list.remove(0);
		
		for(int i = 0; i < list.size() - 1; i++){
			for(int j = 1; j < list.size(); j++){
				if(list.get(i) == list.get(j) && j != i){
					list.remove(j);
					j--;
				}
			}
		}	
		
		return list;
	}
	
	public static ArrayList<Double> getIntersection( ArrayList<Double> one, ArrayList<Double> two ){
		ArrayList <Double> list = new ArrayList <Double>();
		
		for(int i = 0; i < one.size(); i++){
			for(int j = 0; j < two.size(); j++){
				if(one.get(i).equals(two.get(j)) && !(list.contains(one.get(i)))){
					list.add(one.get(i));
				}
			}
		}
		return list;
	}
	
	public static ArrayList<String> getDifference( ArrayList<String> one, ArrayList<String> two ){
		ArrayList <String> list = new ArrayList <String>();
		
		if(one.size() == 0){
			list.addAll(two);
			return list;
		}
		if(two.size() == 0){
			list.addAll(one);
			return list;
		}
		
		for(int i = 0; i < one.size(); i++){
			for(int j = 0; j < two.size(); j++){
				if(!(one.get(i).equals(two.get(j)))){
					if(!(list.contains(two.get(j))))
						list.add(two.get(j));
					if(!(list.contains(one.get(i))))
						list.add(one.get(i));
				}
				if(one.contains(one.get(i)) && two.contains(one.get(i)) && list.contains(one.get(i)))
					list.remove(one.get(i));
				if(one.contains(two.get(j)) && two.contains(two.get(j)) && list.contains(two.get(j)))
					list.remove(two.get(j));
			}
		}
		return list;
	}
}