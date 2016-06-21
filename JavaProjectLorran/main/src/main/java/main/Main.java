package main;

import java.awt.HeadlessException;
import java.io.IOException;

import controller.Controller;
import dao.Model;
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
	 * @throws InterruptedException 
	 */
	public static void main(final String[] args) throws HeadlessException, IOException, InterruptedException {
		int i = 0;

		final Model model = new Model();
		final View view = new View(model);
		final Controller controller = new Controller(view, model);
		view.setController(controller);
		while (i == 0){
			controller.gameLoop();
		}


	}
}