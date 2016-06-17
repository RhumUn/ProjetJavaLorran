package element.mobile;

import java.io.File;


public abstract class Lorann extends Mobile {

	private static File LORANN = new File(FILE + "gate_open.png");
	
	public Lorann() {
		super(LORANN);
	}
	
	public void spellCast() {
	}
	
	public void animate() {
	}

}
