package Quizzes;

public class Quiz1 {
	public static double getPositiveAverage(int [] numbers){
		int total = 0;
		int count = 0;
		double average = 0;
		for(int i = 0; i < numbers.length; i++){
			if(numbers[i] > 0){
				total = total + numbers[i];
				count++;
			}
		}
		if(count > 0)
			average = (double)total / count;
		else
			average = 0.0;
		
		return average;
	}
}
