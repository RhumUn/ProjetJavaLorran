package element.mobile;

import java.io.File;

import contract.Interaction;

public abstract class MulticolorSpell extends Killer implements KillerStrategy {
	
	private static File FIREBALL = new File(FILE + "fireball.gif");
	private static Interaction INTERACTION = Interaction.KILLER;

	public void IA() {
		// TODO Auto-generated method stub

	}
	
	private MulticolorSpell(int x, int y) {
		super(FIREBALL, x, y, INTERACTION);
	}

}
