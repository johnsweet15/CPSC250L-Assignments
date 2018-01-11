package Quizzes;

public class Shoe {
	
	private String name;
	private int size;
	private boolean isLeft;
	
	public Shoe(String name, int size, boolean isLeft){
		this.name = name;
		this.size = size;
		this.isLeft = isLeft;
	}
	
	public String getName(){
		return name;
	}
	
	public int getSize(){
		return size;
	}
	
	public boolean isLeft(){
		return isLeft;
	}
	
	@Override
	public boolean equals(Object other){
		if(name.equals(((Shoe) other).getName()) && size == (((Shoe)other).getSize()) && isLeft == (((Shoe)other).isLeft()))
			return true;
		return false;
	}

}
