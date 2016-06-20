package dao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ModelTest {
	
	private Model model;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.model = new Model();
	}

	@Test
	public void testGetObservable() {
		assertNotNull(this.model.getObservable());
	}

}
