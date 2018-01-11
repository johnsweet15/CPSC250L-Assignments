package Quizzes;

import java.util.NoSuchElementException;

public class Quiz5 {
	
	public static String foo(Quiz5Test.HotPotato potato) {
		String str = "none";
		
		try{
			potato.blah();
		}
		catch(NoSuchElementException g){
			str = ("element");
		}
		catch(ArrayIndexOutOfBoundsException e){
			str = ("index");
		}
		catch(RuntimeException f){
			str = ("runtime");
		}
		return str;
	}
}
