package lorannWorld;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LorannWorldTest {
	
	private LorannWorld world;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.world = new LorannWorld();
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testTestFile() throws IOException {
		this.world.generateLevel();
	}

}