package SuperQuiz;

import Lab04PartB.Person;

public class Dog extends Pet{

	public Dog(String name){
		super(name);
	}
	
	public boolean equals(Object other){
		if(other == null)
			return false;
		if(!(other instanceof Dog))
			return false;
		Dog b = new Dog(getName());
		if((b).compareTo((Dog)other) == 0)
			return true;
		return false;
	}
	
}
