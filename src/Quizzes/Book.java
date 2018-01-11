package Quizzes;

public class Book {

	private String title;
	private int year;
	
	public Book(String title, int year){
		this.year = year;
		this.title = title;
	}
	
	public String getTitle(){
		return this.title;
	}
	
	public int getYear(){
		return this.year;
	}
	
	public static boolean equals(Book a, Book b){
		if(a == null || b == null)
			return false;
		if(!(a instanceof Book) || !(b instanceof Book))
			return false;
		if(a.getTitle().equals(b.getTitle()) && a.getYear() == b.getYear())
			return a.equals(b);
		else
			return false;
	}
}
