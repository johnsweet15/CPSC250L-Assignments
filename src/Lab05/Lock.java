package Lab05;

public class Lock{

	protected Combination unlock;
	private int limit;
	private boolean isOpen;
	
	public Lock(int limit, Combination unlock){
		this.limit = limit;
		this.unlock = unlock;
		isOpen = true;
		
		if(!unlock.isWithinRange(limit)){
			throw new InvalidLockCombinationException();
		}
	}
	
	public int getDialLimit(){
		return limit;
	}

	public void open(Combination combo){
		if(isOpen == false){
			if(unlock.equals(combo)){
				isOpen = true;
			}
			else
				isOpen = false;
		}
		else{
			isOpen = true;
		}
	}
	
	public void close(){
		isOpen = false;
	}
	
	public boolean isOpen(){
		return isOpen;
	}
	
}
