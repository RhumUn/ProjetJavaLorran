package element.mobile;

import java.io.File;

public abstract class MulticolorSpell extends Killer implements KillerStrategy {
	
	private static File FIREBALL = new File(FILE + "fireball.gif");

	public void IA() {
		// TODO Auto-generated method stub

	}
	
	private MulticolorSpell() {
		super(FIREBALL);
	}

}
