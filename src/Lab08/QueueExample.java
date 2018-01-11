package Lab08;

public class QueueExample {
	
	public static Queue<Candy> getCandy(Queue<Candy> dispenser, int	day){
		Queue<Candy> candy = new Queue<Candy>();
		
		if(dispenser.isEmpty())
			return dispenser;
		
		boolean bool = true;
		while(bool){
			if(dispenser.isEmpty())
				break;
			candy.enqueue(dispenser.dequeue());
			if(dispenser.isEmpty())
				break;
			for(int i = 0; i < day; i++){
				dispenser.enqueue(dispenser.dequeue());
			}
		}
		return candy;
	}

}
