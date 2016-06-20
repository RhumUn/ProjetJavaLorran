package controller;


import java.util.Hashtable;

import contract.ControllerOrder;
import contract.IController;

import contract.IMobile;
import contract.IModel;
import contract.IView;


// TODO: Auto-generated Javadoc
/**
 * The Class Controller.
 */
public class Controller implements IController {

	/** The view. */
	@SuppressWarnings("unused")
	private IView view;
	private Hashtable<String, IMobile> mobiles;

	/** The model. */
	private IModel model;

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
	public void orderPerform(final ControllerOrder controllerOrder) {
		switch (controllerOrder) {
		case DOWN:
			if (this.model.isMovePossible(this.mobiles.get("Lorann").getX(), this.mobiles.get("Lorann").getY() + 1) == true)   {
				this.mobiles.get("Lorann").savePosition();
				this.mobiles.get("Lorann").moveDown();
				this.setMobileHasChanged(this.mobiles.get("Lorann"));
			}
			break;
		case UP:
			if (this.model.isMovePossible(this.mobiles.get("Lorann").getX(), this.mobiles.get("Lorann").getY() - 1) == true) {
				this.mobiles.get("Lorann").savePosition();
				this.mobiles.get("Lorann").moveUp();
				this.setMobileHasChanged(this.mobiles.get("Lorann"));
			}
			break;
		case LEFT:
			if (this.model.isMovePossible(this.mobiles.get("Lorann").getX() - 1, this.mobiles.get("Lorann").getY()) == true) {
				this.mobiles.get("Lorann").savePosition();
				this.mobiles.get("Lorann").moveLeft();
				this.setMobileHasChanged(this.mobiles.get("Lorann"));
			}
			break;
		case RIGHT:
			if (this.model.isMovePossible(this.mobiles.get("Lorann").getX() + 1, this.mobiles.get("Lorann").getY()) == true) {
				this.mobiles.get("Lorann").savePosition();
				this.mobiles.get("Lorann").moveRight();
				this.setMobileHasChanged(this.mobiles.get("Lorann"));
			}
			break;
		case UP_RIGHT:
			if (this.model.isMovePossible(this.mobiles.get("Lorann").getX() + 1, this.mobiles.get("Lorann").getY() - 1) == true) {
				this.mobiles.get("Lorann").savePosition();
				this.mobiles.get("Lorann").moveUp();
				this.mobiles.get("Lorann").moveRight();
				this.setMobileHasChanged(this.mobiles.get("Lorann"));
			}
			break;
		case UP_LEFT:
			if (this.model.isMovePossible(this.mobiles.get("Lorann").getX() - 1, this.mobiles.get("Lorann").getY() - 1) == true) {
				this.mobiles.get("Lorann").savePosition();
				this.mobiles.get("Lorann").moveUp();
				this.mobiles.get("Lorann").moveLeft();
				this.setMobileHasChanged(this.mobiles.get("Lorann"));
			}
			break;
		case DOWN_LEFT:
			if (this.model.isMovePossible(this.mobiles.get("Lorann").getX() - 1, this.mobiles.get("Lorann").getY() + 1) == true) {
				this.mobiles.get("Lorann").savePosition();
				this.mobiles.get("Lorann").moveDown();
				this.mobiles.get("Lorann").moveLeft();
				this.setMobileHasChanged(this.mobiles.get("Lorann"));
			}
			break;
		case DOWN_RIGHT:
			if (this.model.isMovePossible(this.mobiles.get("Lorann").getX() + 1, this.mobiles.get("Lorann").getY() + 1) == true) {
				this.mobiles.get("Lorann").savePosition();
				this.mobiles.get("Lorann").moveDown();
				this.mobiles.get("Lorann").moveRight();
				this.setMobileHasChanged(this.mobiles.get("Lorann"));
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
	
	public void gameLoop(){
		this.mobiles.get("GrumpyScreamer");
	}

	public void control() {
		// TODO Auto-generated method stub
		
	}

}
