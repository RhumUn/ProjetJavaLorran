package element.mobile;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MobileTest {
	private int x;
	private int y;
	Mobile MobileATester;
	

	@Before
	public void setUp() throws Exception {
		this.MobileATester = new Killer(null);
		this.x = MobileATester.getX();
		this.y = MobileATester.getY();
		
	}

	@Test
	public void testMoveUp() {
		MobileATester.moveUp();
		assertEquals(this.y - 1, MobileATester.getY());
	}
	@Test
	public void testMoveDown() {
		MobileATester.moveDown();
		assertEquals(this.y + 1, MobileATester.getY());
	}
	@Test
	public void testMoveLeft() {
		MobileATester.moveLeft();
		assertEquals(this.x - 1, MobileATester.getX());
	}
	@Test
	public void testMoveRight() {
		MobileATester.moveRight();
		assertEquals(this.x + 1, MobileATester.getX());
	}

}
