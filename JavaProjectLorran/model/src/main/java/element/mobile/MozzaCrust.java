package element.mobile;

import java.io.File;

import contract.Interaction;
import dao.Model;

public class MozzaCrust extends Killer {
	
	private static File MONSTER = new File(Model.class.getResource(FILE + "monster_2.png").getFile());
	private static Interaction INTERACTION = Interaction.KILLER;
	
	public void IA() {
		this.moveLeft();

	}
	
	public MozzaCrust(int x, int y) {
		super(MONSTER, x, y, INTERACTION);
		this.setName("MozzaCrust");
	}
	

}
