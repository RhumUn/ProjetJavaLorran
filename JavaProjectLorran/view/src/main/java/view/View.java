package view;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.io.IOException;

import javax.swing.SwingUtilities;

import contract.ControllerOrder;
import contract.IController;
import contract.IModel;
import contract.IView;

/**
 * The Class View.
 *
 * @author Jean-Aymeric Diet
 */
public class View implements IView, Runnable {

	/** The frame. */
	private final ViewFrame viewFrame;

	/**
	 * Instantiates a new view.
	 *
	 * @param model
	 *          the model
	 * @throws IOException 
	 * @throws HeadlessException 
	 */
	public View(final IModel model) throws HeadlessException, IOException {
		this.viewFrame = new ViewFrame(model);
		SwingUtilities.invokeLater(this);
	}

	/**
	 * Key code to controller order.
	 *
	 * @param keyCode
	 *          the key code
	 * @return the controller order
	 */
	protected static ControllerOrder keyCodeToControllerOrder(final int keyCode) {
		switch (keyCode) {
			case KeyEvent.VK_NUMPAD8:
				return ControllerOrder.UP;
			case KeyEvent.VK_NUMPAD4:
				return ControllerOrder.LEFT;
			case KeyEvent.VK_NUMPAD6:
				return ControllerOrder.RIGHT;
			case KeyEvent.VK_NUMPAD5:
				return ControllerOrder.DOWN;
			case KeyEvent.VK_NUMPAD7:
				return ControllerOrder.UP_LEFT;
			case KeyEvent.VK_NUMPAD9:
				return ControllerOrder.UP_RIGHT;
			case KeyEvent.VK_NUMPAD1:
				return ControllerOrder.DOWN_LEFT;
			case KeyEvent.VK_NUMPAD3:
				return ControllerOrder.DOWN_RIGHT;
			case KeyEvent.VK_SPACE:
				return ControllerOrder.FIRE;
				
			default:
				return null;
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IView#printMessage(java.lang.String)
	 */
	public void printMessage(final String message) {
		this.viewFrame.printMessage(message);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
		this.viewFrame.setVisible(true);
	}

	/**
	 * Sets the controller.
	 *
	 * @param controller
	 *          the new controller
	 */
	public void setController(final IController controller) {
		this.viewFrame.setController(controller);
	}
}
