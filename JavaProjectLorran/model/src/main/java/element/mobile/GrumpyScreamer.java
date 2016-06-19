package element.mobile;

import java.io.File;

import contract.Interaction;

public class GrumpyScreamer extends Mobile implements KillerStrategy {

	private static File MONSTER = new File(FILE + "monster_1.png");
	private static Interaction INTERACTION = Interaction.KILLER;
	
	public void IA() {
		this.moveLeft();
		this.moveRight();

	}
	
	public GrumpyScreamer(int x, int y) {
		super(MONSTER, x, y, INTERACTION);
	}
	

}
