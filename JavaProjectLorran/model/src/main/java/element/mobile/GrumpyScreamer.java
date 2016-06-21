package element.mobile;

import java.io.File;

import contract.Interaction;
import dao.Model;

public class GrumpyScreamer extends Killer implements KillerStrategy {

	private static File MONSTER = new File(Model.class.getResource(FILE + "monster_1.png").getFile());
	private static Interaction INTERACTION = Interaction.KILLER;
	
	public void IA() {
		this.moveLeft();
		this.moveRight();

	}
	
	public GrumpyScreamer(int x, int y) {
		super(MONSTER, x, y, INTERACTION);
		this.setName("GrumpyScreamer");
	}
	

}
