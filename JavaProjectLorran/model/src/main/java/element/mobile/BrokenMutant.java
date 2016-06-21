package element.mobile;

import java.io.File;

import contract.Interaction;
import dao.Model;

public class BrokenMutant extends Killer implements KillerStrategy {

	private static File MONSTER = new File(Model.class.getResource(FILE + "monster_3.png").getFile());
	private static Interaction INTERACTION = Interaction.KILLER;
	
	public void IA() {

	}
	
	public BrokenMutant(int x, int y) {
		super(MONSTER, x, y, INTERACTION);
		this.setName("BrokenMutant");
	}
	

}
