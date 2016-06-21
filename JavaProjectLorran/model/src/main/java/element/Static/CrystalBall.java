package element.Static;

import java.io.File;

import contract.Interaction;
import dao.Model;

public class CrystalBall extends Interactive{
	
	private static File CRYSTAL_BALL = new File(Model.class.getResource(FILE + "crystal_ball.png").getFile());
	private static Interaction INTERACTION = Interaction.PICKABLE;
	
	public CrystalBall() {
		super(CRYSTAL_BALL, INTERACTION);
	}

}
