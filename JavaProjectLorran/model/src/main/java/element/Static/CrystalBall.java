package element.Static;

import java.io.File;

public class CrystalBall extends Interactive{
	
	private static File CRYSTAL_BALL = new File(FILE + "crystal_ball.png");
	
	public CrystalBall() {
		super(CRYSTAL_BALL);
	}

}
