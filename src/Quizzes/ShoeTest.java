package Quizzes;



import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import org.junit.Test;

public class ShoeTest {
	@Test
	public void testReflection() {
		Class<?>   cClass   = Shoe.class;
		Field[]    cFields  = cClass.getDeclaredFields();

		for (Field f : cFields) {
			if (!f.isSynthetic()) {
				if (!Modifier.isPrivate( f.getModifiers() )) { 
					fail( "Field \""+f.getName()+"\" should be private" );
				}
				if ( Modifier.isStatic ( f.getModifiers() ) && !Modifier.isFinal( f.getModifiers() )) {
					fail( "Field \""+f.getName()+"\" can't be static and not final" );
				}
			}
		}
	}
	@Test
	public void testNew() {
		Shoe shoe = new Shoe( new String("Boot"), 9, true );
		assertEquals( "Incorrect result", "Boot", shoe.getName() );
		assertEquals( "Incorrect result", 9,      shoe.getSize() );
		assertTrue  ( "Incorrect result",         shoe.isLeft() );
	}
	@Test
	public void testEqualsSame() {
		{
			Object one = new Shoe( "Sneaker", 6, false );
			Object two = new Shoe( "Sneaker", 6, false );
			assertEquals( "Incorrect result", one, two );
		}
		{
			Object one = new Shoe( "Slipper", 6, true ) { };
			Object two = new Shoe( "Slipper", 6, true );
			assertEquals( "Incorrect result", one, two );
		}
	}
	@Test
	public void testEqualsNotSame() {
		{
			Object one = new Shoe( "Sneaker", 6, false );
			Object two = new Shoe( "5N34k3R", 6, false );
			assertNotEquals( "Incorrect result", one, two );
		}
		{
			Object one = new Shoe( "Cleat", 11, true );
			Object two = new Shoe( "Cleat",  7, true );
			assertNotEquals( "Incorrect result", one, two );
		}
		{
			Object one = new Shoe( "Slipper", 6, true );
			Object two = new Shoe( "Slipper", 6, false );
			assertNotEquals( "Incorrect result", one, two );
		}
	}
}