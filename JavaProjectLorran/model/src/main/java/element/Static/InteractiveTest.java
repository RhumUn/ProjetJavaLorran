package element.Static;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import element.Interaction;

public class InteractiveTest {
	
	Interactive interactive;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.interactive = new Gold();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testInteract() {
		this.interactive.interact();
	}

}
