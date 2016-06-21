package element.mobile;

import java.io.File;
import java.util.Random;

import contract.ControllerOrder;
import contract.IKiller;
import contract.Interaction;

public class Killer extends Mobile implements IKiller{
	
	private KillerStrategy killerstrategy;
	private int randomNumber;
	Random randomGenerator = new Random();
	ControllerOrder randomOrder;

	public Killer(File sprite, int x, int y, Interaction interaction) {
		super(sprite, x, y, interaction);
	}
	
	public ControllerOrder IA(int x, int y){
		this.randomNumber = randomGenerator.nextInt(10);
		if(randomNumber == 9){
			randomOrder = ControllerOrder.getRandom();
			while (randomOrder == ControllerOrder.FIRE){
				randomOrder = ControllerOrder.getRandom();
			}
			return randomOrder;
		}
		else if (this.getX() >= x && this.getY() == y){
			return ControllerOrder.LEFT;
		}
		else if (this.getX() <= x && this.getY() == y){
			return ControllerOrder.RIGHT;
		}
		else if (this.getY() >= y && this.getX() == x){
			return ControllerOrder.UP;
		}
		else if (this.getY() <= y && this.getX() == x){
			return ControllerOrder.DOWN;
		}
		else if (this.getY() >= y && this.getX() <= x){
			return ControllerOrder.UP_RIGHT;
		}
		else if (this.getY() >= y && this.getX() >= x){
			return ControllerOrder.UP_LEFT;
		}
		else if (this.getY() <= y && this.getX() <= x){
			return ControllerOrder.DOWN_RIGHT;
		}
		else if (this.getY() <= y && this.getX() >= x){
			return ControllerOrder.DOWN_LEFT;
		}
		return null;
	}
	public void kill() {
	}
	
	public void executeStrategy() {
		this.killerstrategy.IA();
	}

}
