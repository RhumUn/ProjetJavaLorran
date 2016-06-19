package element.mobile;

import java.io.File;

import contract.Interaction;

public class MozzaCrust extends Killer implements KillerStrategy {
	
	private static File MONSTER = new File(FILE + "monster_2.png");
	private static Interaction INTERACTION = Interaction.KILLER;
	
	public void IA() {
		// TODO Auto-generated method stub

	}
	
	public MozzaCrust(int x, int y) {
		super(MONSTER, x, y, INTERACTION);
	}
	

}
