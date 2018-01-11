package SuperQuiz;

public class Shift {

	public static void shiftRight(int[] array){
		if(array.length == 0)
			return;
		int n = array[array.length - 1];
		for(int i = array.length - 2; i >= 0; i--){
			array[i + 1] = array[i];
		}
		array[0] = n;
	}
}
