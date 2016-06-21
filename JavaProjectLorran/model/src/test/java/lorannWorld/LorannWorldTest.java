package lorannWorld;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import dao.Model;

public class LorannWorldTest {
	
	private Model world;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.world = new Model();
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testTestFile() throws IOException {
		this.world.generateLevel();
	}

}
