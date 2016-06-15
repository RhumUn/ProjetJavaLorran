package element.mobile;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MobileTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("avant tout");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("après tout");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("avant test");
		
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("après test");
	}


	@Test
	public void testConditionMouveent() {
		fail("Not yet implemented");
	}
	@Test
	public void testMoveUp() {
		fail("Not yet implemented");
	}
	@Test
	public void testMoveDown() {
		fail("Not yet implemented");
	}
	@Test
	public void testMoveLeft() {
		fail("Not yet implemented");
	}
	@Test
	public void testMoveRight() {
		fail("Not yet implemented");
	}

}
