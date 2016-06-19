package element.mobile;

import java.io.File;

import contract.IKiller;
import contract.Interaction;

public class Killer extends Mobile implements IKiller{
	
	private KillerStrategy killerstrategy;

	public Killer(File sprite, int x, int y, Interaction interaction) {
		super(sprite, x, y, interaction);
	}

	public void kill() {
	}
	
	public void executeStrategy() {
		this.killerstrategy.IA();
	}
	

}
