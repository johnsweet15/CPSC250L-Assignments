package Lab02;

public class Lab02Debug {
	public static int findMaximum(int[] anArray) {
		int result = -999999;
		
		for (int i = 0; i <= anArray.length - 1; i++) {
			int value = anArray[ i ];
			if (value > result) {
				result = value;
			}
		}
		return result;
	}
}