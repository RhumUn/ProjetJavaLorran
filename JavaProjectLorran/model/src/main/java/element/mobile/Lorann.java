package element.mobile;

import java.io.File;

import contract.Interaction;


public class Lorann extends Mobile {

	private static File LORANN = new File(FILE + "lorann_br.png");
	private static Interaction INTERACTION = Interaction.BLOCKING;
	
	public Lorann(int x, int y) {
		super(LORANN, x, y, INTERACTION);
	}
	
	public void spellCast() {
	}
	
	public void animate() {
	}

}
