package dao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DBPropertiesTest {
	
	private static DBProperties testDBProperties;
	
	
	@BeforeClass
	
	public static void setUpBeforeClass() throws Exception {
		testDBProperties = new DBProperties();
	}



	@Before
	public void setUp() throws Exception {

	}


	@Test
	public void testGetUrl() {
		String expected = "jdbc:mysql://localhost/jpublankproject?autoReconnect=true&useSSL=false";
		assertEquals(expected, DBPropertiesTest.testDBProperties.getUrl());
	}

	@Test
	public void testGetLogin() {
		String expected = "root";
		assertEquals(expected, DBPropertiesTest.testDBProperties.getLogin());
	}

	@Test
	public void testGetPassword() {
		String expected = "";
		assertEquals(expected, DBPropertiesTest.testDBProperties.getPassword());
	}

}