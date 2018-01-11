package Lab03;

import java.util.*;

public class Lab03One {
	
	public static double getMedian(Integer[] array){
		double median;
		if(array.length > 1){
			if(array.length % 2 != 0){
				java.util.Arrays.sort(array);
				median = array[array.length / 2];
			}
			else{
				java.util.Arrays.sort(array);
				median = ((array[array.length / 2] - array[array.length / 2 - 1]) / 2.0) + array[array.length / 2 - 1];
			}
		}
		else if(array.length == 1)
			median = array[0];
		else
			median = 0;
		return median;
	}
	
	public static Character[] getDigits(Character[] array){
		ArrayList <Character> tempArray = new ArrayList <Character>();
		for(int i = 0; i < array.length; i++){
			if(array[i] == '0' || array[i] == '1' || array[i] == '2' || array[i] == '3' || array[i] == '4' || array[i] == '5' ||
					array[i] == '6' || array[i] == '7' || array[i] == '8' || array[i] == '9')
				tempArray.add(array[i]);
		}
		Character[] newArray = tempArray.toArray(new Character[tempArray.size()]);
		
		return newArray;
	}
}
