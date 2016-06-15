package element.mobile;

import element.Element;
import element.Sprite;

public abstract class Mobile extends Element {
	int x = 0;
	int y = 0;
	
	public Mobile(Sprite sprite) {
	}
	
	public void moveUp() {
		x = x +1;
	}
	
	public void moveLeft() {
	}
	
	public void moveDown() {
	}
	
	public void moveRight() {
	}
	
	public void die() {
	}
	
	public void getMove() {
	}
	
	public void getPosition() {
	}

}
