package Lab04PartB;

public class Person implements Comparable<Person>{

	private String name;
	
	public Person(String aName){
		name = aName;
	}
	
	public void setName(String aName){
		name = aName;
	}
	
	public String getName(){
		return name;
	}
	
	public boolean equals(Object a){
		if(a == null)
			return false;
		if(!(a instanceof Person))
			return false;
		Person b = new Person(getName());
		if((b).compareTo((Person)a) == 0)
			return true;
		return false;
	}
	
	@Override
	public int compareTo(Person arg0) {
		int x = arg0.getName().compareTo(name);
		x = x * -1;
		return x;
	}
}
