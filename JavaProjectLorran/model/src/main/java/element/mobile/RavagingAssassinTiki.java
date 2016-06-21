package element.mobile;

import java.io.File;

import contract.Interaction;
import dao.Model;

public class RavagingAssassinTiki extends Killer implements KillerStrategy {
	
	private static File MONSTER = new File(Model.class.getResource(FILE + "monster_4.png").getFile());
	private static Interaction INTERACTION = Interaction.KILLER;

	public void IA() {
		
	}
	
	public RavagingAssassinTiki(int x, int y) {
		super(MONSTER, x, y, INTERACTION);
		this.setName("RavagingAssassinTiki");
	}
	

}
