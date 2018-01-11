package Quizzes;

import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import org.junit.Test;

public class BookTest {
	@Test
	public void testReflection() {
		Class<?> iClass  = Book.class;
		Field[]  iFields = iClass.getDeclaredFields();

		for (Field f : iFields) {
			if (!f.isSynthetic()) {
				assertTrue ( "Field \""+f.getName()+"\" should be private", Modifier.isPrivate( f.getModifiers() ));
				assertFalse( "Field \""+f.getName()+"\" can't be static",   Modifier.isStatic ( f.getModifiers() ));
			}
		}
	}
	@Test
	public void test0() {
		Book   book  = new Book( "Tick Tock", 2010 );
		String title = book.getTitle();
		int    year  = book.getYear();
		assertEquals( "Incorrect result", "Tick Tock", title );
		assertEquals( "Incorrect result", 2010,        year );
	}
	@Test
	public void test1() {
		Object obj1, obj2;
		// equals
		obj1 = new Book( new String("Unbroken"), 2011 );
		assertTrue( "Incorrect result", obj1.equals( obj1 ));

		obj2 = new Book( new String("Unbroken"), 2011 );
		assertTrue( "Incorrect result", obj1.equals( obj2 ));
		
		obj1 = new Book( new String("Heaven is for Real"), 2011 );
		obj2 = new Book( new String("Unbroken"),           2011 );
		assertFalse( "Incorrect result", obj1.equals( obj2 ));
		
		obj1 = new Book( new String("The Girl With The Dragon Tattoo"), 2008 );
		obj2 = new Book( new String("The Pioneer Woman"),               2008 );
		assertFalse( "Incorrect result", obj1.equals( obj2 ));
		
		obj1 = new Book( new String("Swimsuit"), 2007 );
		obj2 = new Book( new String("Swimsuit"), 2006 );
		assertFalse( "Incorrect result", obj1.equals( obj2 ));
		
		obj1 = new Book( new String("To Kill a Mockingbird"), 1960 );
		obj2 = new String( "To the Lighthouse" );
		assertFalse( "Incorrect result", obj1.equals( obj2 ));
		
		obj1 = new Book( new String("Ubik"), 1969 );
		obj2 = null;
		assertFalse( "Incorrect result", obj1.equals( obj2 ));
	}
	
}