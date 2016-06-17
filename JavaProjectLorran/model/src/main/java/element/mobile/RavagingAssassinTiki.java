package element.mobile;

import java.io.File;

public abstract class RavagingAssassinTiki extends Killer implements KillerStrategy {
	
	private static File MONSTER = new File(FILE + "gate_open.png");

	public void IA() {
		// TODO Auto-generated method stub

	}
	
	public RavagingAssassinTiki() {
		super(MONSTER);
	}
	

}
