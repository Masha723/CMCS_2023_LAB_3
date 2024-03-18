import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;




class GradeBookTester {
	String expected_1="7.0 5.0 4.0 0.0 0.0 ";
	String expected_2="3.0 4.0 5.0 7.0 0.0 ";
	GradeBook book_1;
	GradeBook book_2;


	@BeforeEach
	void setUp() throws Exception {
		book_1=new GradeBook(5);
		book_2=new GradeBook(5);

		book_1.addScore(7.0);
		book_1.addScore(5.0);
		book_1.addScore(4.0);
		
		book_2.addScore(3.0);
		book_2.addScore(4.0);
		book_2.addScore(5.0);
		book_2.addScore(7.0);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		book_1=null;
		book_2=null;
	
	}


	@Test
	void testAddScore() {
		assertTrue(expected_1.equals(book_1.toString()));
		assertTrue(expected_2.equals(book_2.toString()));
		assertEquals(book_1.getScore(),3);
		assertEquals(book_2.getScore(),4);
	}

	@Test
	void testSum() {
		assertEquals(book_1.sum(),16.0);
		assertEquals(book_2.sum(),19.0);


	}

	@Test
	void testMinimum() {
		assertEquals(book_1.minimum(),4.0);
		assertEquals(book_2.minimum(),3.0);
	}

	@Test
	void testFinalScore() {
		assertEquals(book_1.finalScore(),12.0);
		assertEquals(book_2.finalScore(),16.0);
	}

}
