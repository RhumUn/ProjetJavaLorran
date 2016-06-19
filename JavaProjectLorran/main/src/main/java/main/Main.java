package main;

import java.awt.HeadlessException;
import java.io.IOException;

import controller.Controller;
import dao.Model;
import lorannWorld.LorannWorld;
import view.View;

/**
 * The Class Main.
 *
 * @author Jean-Aymeric Diet
 */
public abstract class Main {

	/**
	 * The main method.
	 *
	 * @param args
	 *          the arguments
	 * @throws IOException 
	 * @throws HeadlessException 
	 */
	public static void main(final String[] args) throws HeadlessException, IOException {

		final LorannWorld model = new LorannWorld();
		final View view = new View(model);
		final Controller controller = new Controller(view, model);
		view.setController(controller);
		controller.gameLoop();

	}
}