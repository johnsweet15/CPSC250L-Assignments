package Lab02;

public class Lab02Matrix {

	public static void switchRows( int[][] anArray ){
		int[][] temp = new int[anArray.length][anArray[0].length];
		int z = anArray.length - 1;
		
		for(int i = 0; i < anArray.length; i++){
			for(int j = 0; j < anArray[0].length; j++){
				temp[i][j] = anArray[i][j];
			}
		}
		
		for(int k = 0; k < anArray.length; k++){
			anArray[k] = temp[z];
			z--;
		}
	}
	
	public static void switchColumns( char[][] anArray ){
		char[][] temp = new char[anArray.length][anArray[0].length];
		
		for(int i = 0; i < anArray.length; i++){
			for(int j = 0; j < anArray[0].length; j++){
				temp[i][j] = anArray[i][j];
			}
		}
		for(int k = 0; k < anArray.length; k++){
			int z = anArray[k].length - 1;
			for(int m = 0; m < anArray[k].length; m++){
				anArray[k][m] = temp[k][z];
				z--;
			}
		}
	}

	
	
}