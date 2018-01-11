package Lab02;

import java.util.Arrays;
public class Lab02One {

	public static String arrayToString(int[] anArray){
		String str = "[";
		if(anArray.length != 0){
			for(int i = 0; i < anArray.length; i++){
				if(i == anArray.length - 1)
					str = str + (anArray[i] + "]");
				else
					str = str + (anArray[i] + ", ");
			}
		}
		else
			str = "[]";
		return str;
	}

	public static int arraySum( int[] anArray ){
		int sum = 0;
		for(int i = 0; i < anArray.length; i++){
			sum = sum + anArray[i];
		}
		return sum;
	}
	
	public static double arrayAverage( int[] anArray ){
		int sum = 0;
		double avg = 0.0;
		for(int i = 0; i < anArray.length; i++){
			sum = sum + anArray[i];
		}
		if(sum != 0)
			avg = (double)sum / anArray.length;
		else
			avg = 0;
		return avg;
	}

	public static void main(String[] args){
		int arrayInt[] = new int[]{80,100,80,92,95,87,82,76,45,76,80,70};
		System.out.println("array : " + arrayToString( arrayInt ));
		System.out.println("sum : " + arraySum( arrayInt ));
		System.out.println("average: " + arrayAverage( arrayInt ));
		Arrays.sort( arrayInt );
		System.out.println("sorted : " + arrayToString( arrayInt ));

	}
	
}
