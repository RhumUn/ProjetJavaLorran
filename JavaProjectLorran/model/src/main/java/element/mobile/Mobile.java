package element.mobile;

import element.Element;
import element.Sprite;

public abstract class Mobile extends Element {
	

	
	public Mobile(Sprite sprite) {
		
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
	}
	
	public void getMove() {
		
	}
	
	public void getPosition() {
	}

}
