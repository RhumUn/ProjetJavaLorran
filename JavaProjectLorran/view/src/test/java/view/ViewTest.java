package view;

import static org.junit.Assert.*;

import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Observable;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.ControllerOrder;
import contract.IElement;
import contract.IMobile;
import contract.IModel;

public class ViewTest {
	private static View view;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		view = new View (new IModel(){

			public IElement getElement(int x, int y) {
				// TODO Auto-generated method stub
				return null;
			}

			public IMobile getMobile(IMobile mobile) {
				// TODO Auto-generated method stub
				return null;
			}

			public boolean isMovePossible(int x, int y) {
				// TODO Auto-generated method stub
				return false;
			}

			public void removeElement(int x, int y) {
				// TODO Auto-generated method stub
				
			}

			public void addElement(int x, int y, char textTag) {
				// TODO Auto-generated method stub
				
			}

			public void setElements(int x, int y, IMobile mobile) {
				// TODO Auto-generated method stub
				
			}

			public void generateLevel() throws IOException {
				// TODO Auto-generated method stub
				
			}

			public Hashtable<String, IMobile> getMobiles() {
				// TODO Auto-generated method stub
				return null;
			}

			public Observable getObservable() {
				// TODO Auto-generated method stub
				return new Observable();
			}
			
		});
	}

	@Before
	public void setUp() throws Exception {
	}

	@SuppressWarnings("static-access")
	@Test
	public void testKeyCodeToControllerOrder() {
		int key = KeyEvent.VK_NUMPAD6;
		assertEquals(ControllerOrder.RIGHT,this.view.keyCodeToControllerOrder(key));
	
	}

}
