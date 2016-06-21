package controller;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import contract.ControllerOrder;
import contract.IController;
import contract.IKiller;
import contract.IMobile;
import contract.IModel;
import contract.IView;
import contract.Killers;

// TODO: Auto-generated Javadoc
/**
 * The Class Controller.
 */
public class Controller implements IController {

	/** The view. */
	private IView view;
	private Hashtable<String, IMobile> mobiles;

	/** The model. */
	private IModel model;
	private Killers mob;

	/**
	 * Instantiates a new controller.
	 *
	 * @param view
	 *            the view
	 * @param model
	 *            the model
	 */
	public Controller(final IView view, final IModel model) {
		this.setView(view);
		this.setModel(model);
		this.mobiles = model.getMobiles();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see contract.IController#control()
	 */
	public void control() {
		this.view.printMessage("Appuyer sur les touches 'E', 'F', 'D' ou 'I', pour afficher Hello world dans la langue d votre choix.");
	}

	/**
	 * Sets the view.
	 *
	 * @param view
	 *            the new view
	 */
	private void setView(final IView view) {
		this.view = view;
	}

	/**
	 * Sets the model.
	 *
	 * @param model
	 *            the new model
	 */
	private void setModel(final IModel model) {
		this.model = model;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IController#orderPerform(contract.ControllerOrder)
	 */
	public void orderPerform(final ControllerOrder controllerOrder, String mob) {
		switch (controllerOrder) {
		case DOWN:
			if (this.model.isMovePossible(this.mobiles.get(mob).getX(), this.mobiles.get(mob).getY() + 1, this.mobiles.get(mob)) == true)   {
				this.mobiles.get(mob).savePosition();
				this.mobiles.get(mob).moveDown();
				this.setMobileHasChanged(this.mobiles.get(mob));
			}
			break;
		case UP:
			if (this.model.isMovePossible(this.mobiles.get(mob).getX(), this.mobiles.get(mob).getY() - 1, this.mobiles.get(mob)) == true) {
				this.mobiles.get(mob).savePosition();
				this.mobiles.get(mob).moveUp();
				this.setMobileHasChanged(this.mobiles.get(mob));
			}
			break;
		case LEFT:
			if (this.model.isMovePossible(this.mobiles.get(mob).getX() - 1, this.mobiles.get(mob).getY(), this.mobiles.get(mob)) == true) {
				this.mobiles.get(mob).savePosition();
				this.mobiles.get(mob).moveLeft();
				this.setMobileHasChanged(this.mobiles.get(mob));
			}
			break;
		case RIGHT:
			if (this.model.isMovePossible(this.mobiles.get(mob).getX() + 1, this.mobiles.get(mob).getY(), this.mobiles.get(mob)) == true) {
				this.mobiles.get(mob).savePosition();
				this.mobiles.get(mob).moveRight();
				this.setMobileHasChanged(this.mobiles.get(mob));
			}
			break;
		case UP_RIGHT:
			if (this.model.isMovePossible(this.mobiles.get(mob).getX() + 1, this.mobiles.get(mob).getY() - 1, this.mobiles.get(mob)) == true) {
				this.mobiles.get(mob).savePosition();
				this.mobiles.get(mob).moveUp();
				this.mobiles.get(mob).moveRight();
				this.setMobileHasChanged(this.mobiles.get(mob));
			}
			break;
		case UP_LEFT:
			if (this.model.isMovePossible(this.mobiles.get(mob).getX() - 1, this.mobiles.get(mob).getY() - 1, this.mobiles.get(mob)) == true) {
				this.mobiles.get(mob).savePosition();
				this.mobiles.get(mob).moveUp();
				this.mobiles.get(mob).moveLeft();
				this.setMobileHasChanged(this.mobiles.get(mob));
			}
			break;
		case DOWN_LEFT:
			if (this.model.isMovePossible(this.mobiles.get(mob).getX() - 1, this.mobiles.get(mob).getY() + 1, this.mobiles.get(mob)) == true) {
				this.mobiles.get(mob).savePosition();
				this.mobiles.get(mob).moveDown();
				this.mobiles.get(mob).moveLeft();
				this.setMobileHasChanged(this.mobiles.get(mob));
			}
			break;
		case DOWN_RIGHT:
			if (this.model.isMovePossible(this.mobiles.get(mob).getX() + 1, this.mobiles.get(mob).getY() + 1, this.mobiles.get(mob)) == true) {
				this.mobiles.get(mob).savePosition();
				this.mobiles.get(mob).moveDown();
				this.mobiles.get(mob).moveRight();
				this.setMobileHasChanged(this.mobiles.get(mob));
			}
			break;
		case FIRE:
			if(this.mobiles.containsKey("Spell") == false){
				this.model.addElement(this.mobiles.get("Lorann").getSavedX(), this.mobiles.get("Lorann").getSavedY(), '*');
				this.setMobileHasChanged(this.mobiles.get("Spell"));
			}
			break;

		default:
			
			break;
		}
	}
	
	public void setMobileHasChanged(IMobile mobile){
		this.model.removeElement(mobile.getSavedX(), mobile.getSavedY());
		this.model.setElements(mobile.getX(), mobile.getY(), mobile);
	}
	
	public void gameLoop() throws InterruptedException{
		
		if (this.mobiles.get("Lorann").isWinning() == true){
			this.view.printMessage("WELL PLAYED, YOU ESCAPED THE CRYPT");
			TimeUnit.DAYS.sleep(1);
		}
		if (this.mobiles.get("Lorann").isDead() == true){
			this.view.printMessage("YOU DIED");
			TimeUnit.DAYS.sleep(1);
		
		}
		this.mob = Killers.GrumpyScreamer;
		while (this.mob != Killers.NOP){
			if (this.mobiles.get(mob.toString()) != null){
				orderPerform(((IKiller) this.mobiles.get(mob.toString())).IA(this.mobiles.get("Lorann").getX(), this.mobiles.get("Lorann").getY()), mob.toString());
			}
			this.mob = this.mob.next();
		}

		TimeUnit.MILLISECONDS.sleep(300);
	}

}
