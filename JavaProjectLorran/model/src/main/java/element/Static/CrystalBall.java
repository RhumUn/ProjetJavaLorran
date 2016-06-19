package element.Static;

import java.io.File;

import contract.Interaction;

public class CrystalBall extends Interactive{
	
	private static File CRYSTAL_BALL = new File(FILE + "crystal_ball.png");
	private static Interaction INTERACTION = Interaction.PICKABLE;
	
	public CrystalBall() {
		super(CRYSTAL_BALL, INTERACTION);
	}

}
