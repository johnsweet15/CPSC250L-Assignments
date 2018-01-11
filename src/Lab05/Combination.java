package Lab05;

public class Combination {

	private int one;
	private int two;
	private int three;
	
	public Combination(int one, int two, int three){
		this.one = one;
		this.two = two;
		this.three = three;
	}
	
	public int[] getNumbers(){
		int[] numbers = new int[3];
		numbers[0] = one;
		numbers[1] = two;
		numbers[2] = three;
		return numbers;
	}
	
	public boolean isWithinRange(int limit){
		if((one >= 0 && one <= limit) && (two >= 0 && two <= limit) && (three >= 0 && three <= limit))
			return true;
		return false;
	}
	
	public boolean equals(Object o){
		if(o instanceof Combination){
			Combination combo = (Combination)o;
			
			int[] array = new int[3];
			array = combo.getNumbers();
			
			if(array[0] == one && array[1] == two && array[2] == three){
				return true;
			}
		}
		
		return false;
	}
	
}
