package view;

import static org.junit.Assert.*;

import java.awt.event.KeyEvent;


import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import contract.IModel;

public class ViewFrameTest {
	
	private static ViewFrame testFrame;
	private static KeyEvent e;
	private static int key;
	private static IModel model;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//model = new Model();
		testFrame = new ViewFrame(model);
		e = new KeyEvent(testFrame,KeyEvent.KEY_PRESSED,System.currentTimeMillis(),0,KeyEvent.VK_E,'e');
		key = KeyEvent.VK_E;
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testKeyTyped() {
		testFrame.keyTyped(e);
		assertEquals(key, e.getKeyCode());
	}

	@Test
	public void testKeyPressed() {
		testFrame.keyPressed(e);
		assertEquals(key, e.getKeyCode());
	}

	@Test
	public void testKeyReleased() {
		testFrame.keyReleased(e);
		assertEquals(key, e.getKeyCode());
	}

}
