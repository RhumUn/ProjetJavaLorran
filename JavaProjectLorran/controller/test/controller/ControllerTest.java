package controller;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.IModel;
import contract.IView;

public class ControllerTest {
	Controller controller;
	IView view;
	IModel model;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	@Before
	public void setUp() throws Exception {
		controller = new Controller(null, null);
	}

	@Test
	public void testgetView() {
		controller.setView(view);
		assertEquals(view, controller.getView());

	}

	@Test
	public void testgetModel() {
		controller.setModel(model);
		assertEquals(view, controller.getModel());
	}

}
