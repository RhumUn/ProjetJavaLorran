package element.mobile;

import java.io.File;

import contract.Interaction;
import dao.Model;


public class Lorann extends Mobile {

	private static File LORANN = new File(Model.class.getResource(FILE + "lorann_br.png").getFile());
	private static Interaction INTERACTION = Interaction.VICTIM;
	
	public Lorann(int x, int y) {
		super(LORANN, x, y, INTERACTION);
		this.setName("Lorann");
	}
	
	public void spellCast() {
	}
	
	public void animate() {
	}

}
