package element.mobile;

import java.io.File;

import contract.Interaction;

public class BrokenMutant extends Killer implements KillerStrategy {

	private static File MONSTER = new File(FILE + "monster_3.png");
	private static Interaction INTERACTION = Interaction.KILLER;
	
	public void IA() {
		// TODO Auto-generated method stub

	}
	
	public BrokenMutant(int x, int y) {
		super(MONSTER, x, y, INTERACTION);
	}
	

}
