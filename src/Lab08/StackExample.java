package Lab08;

public class StackExample {

	public static Stack<Integer> getEvenNumbers(Stack<Integer> stack){
		Stack<Integer> answer = new Stack<Integer>();
		Stack<Integer> tmp = new Stack<Integer>();
		
		while(!(stack.isEmpty())){
			tmp.push(stack.pop());
		}
		
		while(!(tmp.isEmpty())){
			Integer num = tmp.pop();
			stack.push(num);
			
			if(num % 2 == 0)
				answer.push(num);	
		}
		return answer;
	}
	
}
