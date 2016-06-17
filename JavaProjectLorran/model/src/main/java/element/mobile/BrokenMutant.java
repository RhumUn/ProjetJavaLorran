package element.mobile;

import java.io.File;

public abstract class BrokenMutant extends Killer implements KillerStrategy {

	private static File MONSTER = new File(FILE + "monster_3.png");
	
	public void IA() {
		// TODO Auto-generated method stub

	}
	
	public BrokenMutant() {
		super(MONSTER);
	}
	

}
