package element.mobile;

import java.io.File;

import contract.IMobile;
import contract.Interaction;
import element.Element;


public abstract class Mobile extends Element implements IMobile {
	private int x;
	private int y;
	private boolean winning;
	private boolean dead;
	private int savedX;
	private int savedY;
	private String name;
	
	public Mobile(File sprite, int x, int y, Interaction interaction) {
		super(sprite, interaction);
		this.setX(x);
		this.setY(y);
	}
	
	public void moveUp() {
		this.setY(this.getY() - 1);
	}
	
	public void moveLeft() {
		this.setX(this.getX() - 1);
	}
	
	public void moveDown() {
		this.setY(this.getY() + 1);
	}
	
	public void moveRight() {
		this.setX(this.getX() + 1);
	}
	
	public void die() {
		this.setX(1);
		this.setY(1);
	}
	
	public void savePosition() {
		this.savedX = getX();
		this.savedY = getY();
	}
	
	public int getSavedX() {
		return savedX;
	}

	public int getSavedY() {
		return savedY;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public boolean isWinning() {
		return winning;
	}

	public void setWinning(boolean winning) {
		this.winning = winning;
	}

	public boolean isDead() {
		return dead;
	}

	public void setDead(boolean dead) {
		this.dead = dead;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
