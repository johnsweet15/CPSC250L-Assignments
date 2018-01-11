package SuperQuiz;

public class Pet implements Comparable{
	
	private String name;
	
	public Pet(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String toString(String name){
		return name;
	}
	
	public boolean equals(Object other){
		if(other == null)
			return false;
		if(!(other instanceof Pet))
			return false;
		Pet b = new Pet(getName());
		if((b).compareTo((Pet)other) == 0)
			return true;
		return false;
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
