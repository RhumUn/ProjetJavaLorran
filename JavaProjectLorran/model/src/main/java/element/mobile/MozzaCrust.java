package element.mobile;

import java.io.File;

public abstract class MozzaCrust extends Killer implements KillerStrategy {
	
	private static File MONSTER = new File(FILE + "monster_2.png");
	
	public void IA() {
		// TODO Auto-generated method stub

	}
	
	public MozzaCrust() {
		super(MONSTER);
	}
	

}
