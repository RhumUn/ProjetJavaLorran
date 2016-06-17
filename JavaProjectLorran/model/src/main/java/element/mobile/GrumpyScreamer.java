package element.mobile;

import java.io.File;

public abstract class GrumpyScreamer extends Killer implements KillerStrategy {

	private static File MONSTER = new File(FILE + "monster_1.png");
	
	public void IA() {
		// TODO Auto-generated method stub

	}
	
	public GrumpyScreamer() {
		super(MONSTER);
	}
	

}
