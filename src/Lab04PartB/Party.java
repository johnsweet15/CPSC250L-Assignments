package Lab04PartB;

import java.util.*;

public class Party {

	private ArrayList<Person> invited;
	private ArrayList<Person> rsvp;
	
	public Party(){
		invited = new ArrayList<Person>();
		rsvp = new ArrayList<Person>();
	}
	
	public void addInvited(Person a){
		
		if(!(invited.contains(a))){
			Person b = new Person(a.getName());
			invited.add(b);
		}
	}
	
	public ArrayList<Person> getInvited(){
		ArrayList<Person> copy = new ArrayList<Person>();
		for(Person p: invited){
			p = new Person(p.getName());
			copy.add(p);
		}
		return copy;
	}
	
	public void addRSVP(Person a){
		Person b = new Person(a.getName());
		if(invited.contains(a) && !(rsvp.contains(a)))
			rsvp.add(b);
	}
	
	public ArrayList<Person> getRSVP(){
		ArrayList<Person> copy = new ArrayList<Person>();
		for(Person p: rsvp){
			p = new Person(p.getName());
			copy.add(p);
		}
		return copy;
	}
}
